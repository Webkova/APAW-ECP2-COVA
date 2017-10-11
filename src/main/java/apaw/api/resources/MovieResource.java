package apaw.api.resources;

import java.util.Optional;

import apaw.api.controllers.MovieController;
import apaw.api.dtos.MovieDto;
import apaw.api.resources.exceptions.MovieFieldInvalidException;
import apaw.api.resources.exceptions.MovieIdNotFoundException;

public class MovieResource {

    public static final String MOVIES = "movies";

    public static final String ID = "/{id}";

    public static final String ID_TITLE = ID + "/title";

    public static final String ID_DEBUT = ID + "/debut";
    
    
    public MovieDto readMovie(int movieId) throws MovieIdNotFoundException {
        Optional<MovieDto> optional = new MovieController().readMovie(movieId);//Delego en el controlador para que lo haga él.
        //Con Java8, Optional. Significa que puede que te lo devuelva o no (sea null). De una forma explícita me dice que puede ser null.
        //NO es necesario hacer htmeDto == null y lanzar una excepción.
        
        
        
        System.out.println("OPTIONAL " + optional);
        return optional.orElseThrow(() -> new MovieIdNotFoundException(Integer.toString(movieId)));
        //devuelve el opcional si lo tienes y si no lo tiene me montas una excepción (ThemeIdNotFoundException).
    }

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

}
