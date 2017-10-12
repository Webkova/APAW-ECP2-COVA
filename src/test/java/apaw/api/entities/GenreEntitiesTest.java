package apaw.api.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GenreEntitiesTest {
    
Genre genre = new Genre("Thriller");
       
    @Test
    public void testGetTitle() {
        assertEquals("Thriller", genre.getName());
    }
    
    @Test
    public void testGetID() {
        assertEquals(0, genre.getId());
    }
}
