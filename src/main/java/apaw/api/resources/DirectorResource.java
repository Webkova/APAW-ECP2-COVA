package apaw.api.resources;

import java.util.Optional;

import apaw.api.controllers.DirectorController;
import apaw.api.dtos.DirectorDto;
import apaw.api.resources.exceptions.DirectorFieldInvalidException;
import apaw.api.resources.exceptions.DirectorIdNotFoundException;


public class DirectorResource {

    public static final String DIRECTORS = "directors";
    
    public static final String ID = "/{id}";
    
    
    
    public void createDirector(String directorName) throws DirectorFieldInvalidException {
        this.validateField(directorName);
        new DirectorController().createDirector(directorName);
    }
    
    private void validateField(String field) throws DirectorFieldInvalidException {
        if (field == null || field.isEmpty()) {
            throw new DirectorFieldInvalidException(field);
        }
    }
    
    public DirectorDto readDirector(int directorName) throws DirectorIdNotFoundException {
        Optional<DirectorDto> optional = new DirectorController().readDirector(directorName);       
        return optional.orElseThrow(() -> new DirectorIdNotFoundException(Integer.toString(directorName)));

    }
}
