package apaw.api.controllers;

import org.junit.Test;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.memory.DaoMemoryFactory;

public class MovieControllerIT {

    private MovieController themeController;

    @Test
    public void testCreate() {
        DaoFactory.setFactory(new DaoMemoryFactory());
        themeController = new MovieController();
        themeController.createMovie(2);

    }

}
