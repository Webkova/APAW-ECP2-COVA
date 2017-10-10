package apaw;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import apaw.api.resources.MovieResource;
import apaw.http.HttpClientService;
import apaw.http.HttpMethod;
import apaw.http.HttpRequest;
import apaw.http.HttpRequestBuilder;
import apaw.http.HttpException;

public class MovieResourceFunctionalTesting {

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
    public void testCreateWithoutThemeName() {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(MovieResource.MOVIES).build();
        new HttpClientService().httpRequest(request);
    }
    
//    @Test
//    public void testReadTheme() {
//        this.createMovie();
//        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.GET).path(MovieResource.MOVIES).path(MovieResource.ID)
//                .expandPath("1").build();
//        assertEquals("{\"id\":1,\"name\":\"1\"}", new HttpClientService().httpRequest(request).getBody());
//
//    }
    
    
}
