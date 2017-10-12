package apaw.api.resources;

import apaw.api.controllers.GenreController;
import apaw.api.resources.exceptions.GenreFieldInvalidException;


public class GenreResource {

    public static final String GENRES = "genres";

      
    public void createGenre(String genreName) throws GenreFieldInvalidException {
        this.validateField(genreName);
        new GenreController().createGenre(genreName);
    }

    private void validateField(String field) throws GenreFieldInvalidException {
        if (field == null || field.isEmpty()) {
            throw new GenreFieldInvalidException(field);
        }
    }

}
