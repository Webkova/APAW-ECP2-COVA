package apaw.api.resources;

import java.util.Optional;

import apaw.api.controllers.GenreController;
import apaw.api.dtos.GenreDto;
import apaw.api.resources.exceptions.GenreFieldInvalidException;
import apaw.api.resources.exceptions.GenreIdNotFoundException;


public class GenreResource {

    public static final String GENRES = "genres";
    
    public static final String ID = "/{id}";

      
    public void createGenre(String genreName) throws GenreFieldInvalidException {
        this.validateField(genreName);
        new GenreController().createGenre(genreName);
    }

    private void validateField(String field) throws GenreFieldInvalidException {
        if (field == null || field.isEmpty()) {
            throw new GenreFieldInvalidException(field);
        }
    }
    
    public GenreDto readGenre(int genreId) throws GenreIdNotFoundException {
        Optional<GenreDto> optional = new GenreController().readGenre(genreId);        

        return optional.orElseThrow(() -> new GenreIdNotFoundException(Integer.toString(genreId)));
    
    }

}
