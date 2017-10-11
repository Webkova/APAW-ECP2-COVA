package apaw.api.controllers;

import apaw.api.daos.DaoFactory;
import apaw.api.entities.Director;

public class DirectorController {

    public void createDirector(int movieId) {
        DaoFactory.getFactory().getDirectorDao().create(new Director(movieId));
    }
 }


