package apaw.api.controllers;

import java.util.Optional;

import apaw.api.daos.DaoFactory;
import apaw.api.dtos.MovieDto;
import apaw.api.entities.Movie;

public class MovieController {
    
    private boolean existMovieId(int themeId) {
        return DaoFactory.getFactory().getMovieDao().read(themeId) != null;
    }

    public void createMovie(String movieName) {
        DaoFactory.getFactory().getMovieDao().create(new Movie(movieName));
    }

    public Optional<MovieDto> readMovie(int themeId) {
        if (existMovieId(themeId)) {
             return Optional.of(new MovieDto(DaoFactory.getFactory().getMovieDao().read(themeId)));
         } else {
             return Optional.empty();
         }
     }
}
