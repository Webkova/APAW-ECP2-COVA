package apaw.api.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.memory.DaoMemoryFactory;

public class GenreControllerIT {

private GenreController genreController;
     

    @Before
    public void before(){
        DaoFactory.setFactory(new DaoMemoryFactory());
        genreController = new GenreController();
        genreController.createGenre("ACTION");  
    }
    
    @Test
    public void testReadGenre() {
       assertEquals("ACTION",genreController.readGenre(0).get().getName());
    }
    
    @Test
    public void testReadMovieNonExistId() {
       assertFalse(genreController.readGenre(2).isPresent());
    }    
    
    
    @Test
    public void testCreate() {
        DaoFactory.setFactory(new DaoMemoryFactory());
        genreController = new GenreController();
        genreController.createGenre("ACTION");

    }
}
