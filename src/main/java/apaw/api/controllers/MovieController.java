package apaw.api.controllers;

import apaw.api.daos.DaoFactory;
import apaw.api.entities.Movie;


public class MovieController {

    public void createMovie(int movieId) {
        DaoFactory.getFactory().getMovieDao().create(new Movie(movieId));
    }


}
