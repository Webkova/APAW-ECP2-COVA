package apaw;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import apaw.api.daos.DaoFactory;
import apaw.api.resources.MovieResource;
import apaw.http.HttpClientService;
import apaw.http.HttpMethod;
import apaw.http.HttpRequest;
import apaw.http.HttpRequestBuilder;
import apaw.http.HttpException;
import apaw.api.daos.memory.DaoMemoryFactory;

public class MovieResourceFunctionalTesting {
    
    
    @Before
    public void before(){
        DaoFactory.setFactory(new DaoMemoryFactory());
    }
    

    private void createMovie() {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(MovieResource.MOVIES).body("1").build();
        new HttpClientService().httpRequest(request);
    }
    
    @Test
    public void testCreateMovie() {
        this.createMovie();
    }
    
    @Test(expected = HttpException.class)
    public void testCreateMovieIdEmpty() {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(MovieResource.MOVIES).body("").build();
        new HttpClientService().httpRequest(request);
    }
    
    @Test(expected = HttpException.class)
    public void testCreateWithoutMovie() {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(MovieResource.MOVIES).build();
        new HttpClientService().httpRequest(request);
    }
    
    @Test
    public void testReadMovie() {
        this.createMovie();
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.GET).path(MovieResource.MOVIES).path(MovieResource.ID)
                .expandPath("1").build();
        System.out.println("Esta es la request: " + request);
        new HttpClientService().httpRequest(request);
//        System.out.println("Esta es la request: " + request);
       // assertEquals("HTTP/1.1 200 OK", new HttpClientService().httpRequest(request).getBody());

    }
    
    
}
