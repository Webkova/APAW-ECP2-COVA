package apaw.api;

import apaw.api.resources.exceptions.RequestInvalidException;
import apaw.http.HttpRequest;
import apaw.http.HttpResponse;
import apaw.http.HttpStatus;

public class Dispatcher {



    private void responseError(HttpResponse response, Exception e) {
        response.setBody("{\"error\":\"" + e + "\"}");
        response.setStatus(HttpStatus.BAD_REQUEST);
    }

    public void doGet(HttpRequest request, HttpResponse response) {

    }

    public void doPost(HttpRequest request, HttpResponse response) {
        
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
