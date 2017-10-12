package apaw.api.controllers;

import java.util.Optional;

import apaw.api.daos.DaoFactory;
import apaw.api.dtos.MovieDto;
import apaw.api.entities.Movie;

public class MovieController {
    
    private boolean existMovieId(int movieId) {
        return DaoFactory.getFactory().getMovieDao().read(movieId) != null;
    }

    public void createMovie(String movieName) {
        DaoFactory.getFactory().getMovieDao().create(new Movie(movieName));
    }

    public Optional<MovieDto> readMovie(int movieId) {
        if (existMovieId(movieId)) {
             return Optional.of(new MovieDto(DaoFactory.getFactory().getMovieDao().read(movieId)));
         } else {
             return Optional.empty();
         }
     }
}
