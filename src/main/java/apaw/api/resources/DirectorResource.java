package apaw.api.resources;

import apaw.api.controllers.DirectorController;
import apaw.api.resources.exceptions.DirectorFieldInvalidException;


public class DirectorResource {

    public static final String DIRECTORS = "directors";
    
    public static final String ID = "/{id}";
    
    public static final String ID_NAME = ID + "/name";
    
    
    public void createDirector(String directorId) throws DirectorFieldInvalidException {
        this.validateField(directorId);
        new DirectorController().createDirector(Integer.parseInt(directorId));
    }
    
    private void validateField(String field) throws DirectorFieldInvalidException {
        if (field == null || field.isEmpty()) {
            throw new DirectorFieldInvalidException(field);
        }
    }
}
