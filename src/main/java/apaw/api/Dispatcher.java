package apaw.api;

import apaw.api.resources.DirectorResource;
import apaw.api.resources.GenreResource;
import apaw.api.resources.MovieResource;
import apaw.api.resources.exceptions.RequestInvalidException;
import apaw.http.HttpRequest;
import apaw.http.HttpResponse;
import apaw.http.HttpStatus;

public class Dispatcher {

    private MovieResource movieResource = new MovieResource();
    private DirectorResource directorResource = new DirectorResource();
    private GenreResource genreResource = new GenreResource();

    private void responseError(HttpResponse response, Exception e) {
        response.setBody("{\"error\":\"" + e + "\"}");
        response.setStatus(HttpStatus.BAD_REQUEST);
    }

    public void doGet(HttpRequest request, HttpResponse response) {
        try {
            System.out.println("El valor es: " + request);
            if (request.isEqualsPath(MovieResource.MOVIES + MovieResource.ID)) {
                response.setBody(movieResource.readMovie(Integer.valueOf(request.paths()[1])).toString());
            }else if (request.isEqualsPath(DirectorResource.DIRECTORS + DirectorResource.ID)) {
                response.setBody(directorResource.readDirector(Integer.valueOf(request.paths()[1])).toString());   
            } else {
                throw new RequestInvalidException(request.getPath());
            }
        } catch (Exception e) {
            responseError(response, e);
        }
    }

    public void doPost(HttpRequest request, HttpResponse response) {
        try {
            if (request.isEqualsPath(MovieResource.MOVIES)) {
                movieResource.createMovie(request.getBody());
                response.setStatus(HttpStatus.CREATED);
            } else if (request.isEqualsPath(DirectorResource.DIRECTORS)) {
                directorResource.createDirector(request.getBody());
                response.setStatus(HttpStatus.CREATED);
            } else if (request.isEqualsPath(GenreResource.GENRES)) {
                genreResource.createGenre(request.getBody());
                response.setStatus(HttpStatus.CREATED);
            }else {
                throw new RequestInvalidException(request.getPath());
            }
        } catch (Exception e) {
            responseError(response, e);
        }

    }

    public void doPut(HttpRequest request, HttpResponse response) {
        responseError(response, new RequestInvalidException(request.getPath()));
    }

    public void doPatch(HttpRequest request, HttpResponse response) {
        responseError(response, new RequestInvalidException(request.getPath()));
    }

    public void doDelete(HttpRequest request, HttpResponse response) {
        responseError(response, new RequestInvalidException(request.getPath()));
    }

}
