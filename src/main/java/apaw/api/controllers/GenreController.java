package apaw.api.controllers;

import apaw.api.daos.DaoFactory;
import apaw.api.entities.Genre;

public class GenreController {
    
    public void createGenre(String genreName) {
        DaoFactory.getFactory().getGenreDao().create(new Genre(genreName));
    }

}
