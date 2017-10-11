package apaw.api.resources;

import apaw.api.controllers.MovieController;
import apaw.api.resources.exceptions.MovieFieldInvalidException;

public class MovieResource {

    public static final String MOVIES = "movies";

    public static final String ID = "/{id}";

    public static final String ID_TITLE = ID + "/title";

    public static final String ID_DEBUT = ID + "/debut";

    public void createMovie(String movieid) throws MovieFieldInvalidException {
        this.validateField(movieid);
        //new MovieController().createMovie(this.convetStringToLong(movieid));
        new MovieController().createMovie(Integer.parseInt(movieid));
    }

    private void validateField(String field) throws MovieFieldInvalidException {
        if (field == null || field.isEmpty()) {
            throw new MovieFieldInvalidException(field);
        }
    }

    private Long convetStringToLong(String idMovie) {
        return Long.parseLong(idMovie);
    }
}
