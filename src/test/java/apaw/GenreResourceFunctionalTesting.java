package apaw;

import org.junit.Before;
import org.junit.Test;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.memory.DaoMemoryFactory;
import apaw.api.resources.GenreResource;
import apaw.http.HttpClientService;
import apaw.http.HttpException;
import apaw.http.HttpMethod;
import apaw.http.HttpRequest;
import apaw.http.HttpRequestBuilder;

public class GenreResourceFunctionalTesting {

    @Before
    public void before() {
        DaoFactory.setFactory(new DaoMemoryFactory());
    }

    private void createGenre(String idGenre) {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(GenreResource.GENRES).body(idGenre).build();
        new HttpClientService().httpRequest(request);
    }

    @Test
    public void testCreateGenre() {
        this.createGenre("ACTION");
    }

    @Test(expected = HttpException.class)
    public void testCreateGenreIdEmpty() {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(GenreResource.GENRES).body("").build();
        new HttpClientService().httpRequest(request);
    }

    @Test(expected = HttpException.class)
    public void testCreateWithoutMovie() {
        HttpRequest request = new HttpRequestBuilder().method(HttpMethod.POST).path(GenreResource.GENRES).build();
        new HttpClientService().httpRequest(request);
    }
}
