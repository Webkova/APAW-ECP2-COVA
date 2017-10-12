package apaw.api.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
    
    @Test
    public void testReadTheme() {
       assertEquals("Denis Villeneuve", directorController.readDirector(0).get().getName());
    }
    
    @Test
    public void testReadDirectorNonExistId() {
       assertFalse(directorController.readDirector(2).isPresent());
    }

    @Test
    public void testCreate() {
        DaoFactory.setFactory(new DaoMemoryFactory());
        directorController = new DirectorController();
        directorController.createDirector("Denis Villeneuve");

    }
}
