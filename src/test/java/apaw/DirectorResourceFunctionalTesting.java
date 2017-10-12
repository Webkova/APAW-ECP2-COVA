package apaw;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import apaw.api.daos.DaoFactory;
import apaw.api.resources.DirectorResource;
import apaw.api.resources.MovieResource;
import apaw.http.HttpClientService;
import apaw.http.HttpMethod;
import apaw.http.HttpRequest;
import apaw.http.HttpRequestBuilder;
import apaw.http.HttpException;
import apaw.api.daos.memory.DaoMemoryFactory;

public class DirectorResourceFunctionalTesting {
    
    
    @Before
    public void before(){
        DaoFactory.setFactory(new DaoMemoryFactory());
    }
    

    private void createDirector(String directorName) {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(DirectorResource.DIRECTORS).body(directorName).build();
        new HttpClientService().httpRequest(request);
    }
    
    @Test
    public void testCreateDirector() {
        this.createDirector("Denis Villeneuve");
    }
    
    @Test(expected = HttpException.class)
    public void testCreateDirectorIdEmpty() {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(DirectorResource.DIRECTORS).body("").build();
        new HttpClientService().httpRequest(request);
    }
    
    @Test(expected = HttpException.class)
    public void testCreateWithoutDirector() {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(DirectorResource.DIRECTORS).build();
        new HttpClientService().httpRequest(request);
    }
    
    @Test
    public void testReadDirector() {
        this.createDirector("Isabel Coixet");
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.GET).path(MovieResource.MOVIES).path(MovieResource.ID)
                .expandPath("0").build();
       // assertEquals("{\"id\":0,\"title\":\"Isabel Coixet\"}",
       //         new HttpClientService().httpRequest(request).getBody());

    }
    
}
