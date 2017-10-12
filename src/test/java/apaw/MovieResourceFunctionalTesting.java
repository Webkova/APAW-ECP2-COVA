package apaw;

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
    

    private void createMovie(String idMovie) {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(MovieResource.MOVIES).body(idMovie).build();
        new HttpClientService().httpRequest(request);
    }
    
    @Test
    public void testCreateMovie() {
        this.createMovie("1");
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
        this.createMovie("2");
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.GET).path(MovieResource.MOVIES).path(MovieResource.ID)
                .expandPath("2").build();
        System.out.println("Esta es la request: " + request);
        new HttpClientService().httpRequest(request);
//        System.out.println("Esta es la request: " + request);
       // assertEquals("HTTP/1.1 200 OK", new HttpClientService().httpRequest(request).getBody());

    }
    
    
}
