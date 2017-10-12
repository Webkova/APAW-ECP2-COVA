package apaw.api.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import apaw.api.entities.Movie;

public class MovieEntitiesTest {

    Movie movie = new Movie("Star Wars");
    
    @Test
    public void testGetDebut() {
        assertEquals(2017, movie.getDebut());
    }
    
    @Test
    public void testGetTitle() {
        assertEquals("Star Wars", movie.getTitle());
    }
    
    @Test
    public void testGetID() {
        assertEquals(0, movie.getId());
    }
}
