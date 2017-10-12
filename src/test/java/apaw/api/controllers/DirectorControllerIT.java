package apaw.api.controllers;

import org.junit.Before;
import org.junit.Test;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.memory.DaoMemoryFactory;

public class DirectorControllerIT {

    private DirectorController directorController;
    
    @Before
    public void before() {
        DaoFactory.setFactory(new DaoMemoryFactory());
        directorController = new DirectorController();
        directorController.createDirector("Denis Villeneuve");
    }
    
//    @Test
//    public void testReadTheme() {
//       assertEquals("Star Wars", directorController.readDirector(0).get().getTitle());
//    }
//    
//    @Test
//    public void testReadMovieNonExistId() {
//       assertFalse(directorController.readMovie(2).isPresent());
//    }

    @Test
    public void testCreate() {
        DaoFactory.setFactory(new DaoMemoryFactory());
        directorController = new DirectorController();
        directorController.createDirector("Denis Villeneuve");

    }
}
