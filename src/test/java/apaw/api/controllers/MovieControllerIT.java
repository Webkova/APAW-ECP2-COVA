package apaw.api.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.memory.DaoMemoryFactory;
import apaw.api.controllers.MovieController;

public class MovieControllerIT {

    private MovieController movieController;
    
    @Before
    public void before() {
        DaoFactory.setFactory(new DaoMemoryFactory());
        movieController = new MovieController();
        movieController.createMovie("Star Wars");
    }
    
    @Test
    public void testReadTheme() {
       assertEquals("Star Wars",movieController.readMovie(0).get().getTitle());
    }
    
    @Test
    public void testReadMovieNonExistId() {
       assertFalse(movieController.readMovie(2).isPresent());
    }

    @Test
    public void testCreate() {
        DaoFactory.setFactory(new DaoMemoryFactory());
        movieController = new MovieController();
        movieController.createMovie("Star Wars: Episode IV - A New Hope");

    }

}
