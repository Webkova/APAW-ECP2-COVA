package apaw.api.controllers;

import org.junit.Test;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.memory.DaoMemoryFactory;

public class GenreControllerIT {

private GenreController genreController;
     

    @Test
    public void testCreate() {
        DaoFactory.setFactory(new DaoMemoryFactory());
        genreController = new GenreController();
        genreController.createGenre("ACTION");

    }
}
