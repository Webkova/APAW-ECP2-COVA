package apaw.api.controllers;

import java.util.Optional;

import apaw.api.daos.DaoFactory;
import apaw.api.dtos.GenreDto;
import apaw.api.entities.Genre;

public class GenreController {
    
    private boolean existGenreId(int genreId) {
        return DaoFactory.getFactory().getGenreDao().read(genreId) != null;
    }
    
    public void createGenre(String genreName) {
        DaoFactory.getFactory().getGenreDao().create(new Genre(genreName));
    }
    
    public Optional<GenreDto> readGenre(int genreId) {
        if (existGenreId(genreId)) {
             return Optional.of(new GenreDto(DaoFactory.getFactory().getGenreDao().read(genreId)));
         } else {
             return Optional.empty();
         }
     }

}
