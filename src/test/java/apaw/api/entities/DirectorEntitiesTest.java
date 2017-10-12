package apaw.api.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DirectorEntitiesTest {
    
 Director director = new Director("Isabel Coixet");
    
    @Test
    public void testGetLevel() {
        assertEquals(9, director.getLevel());
    }
    
    @Test
    public void testGetTitle() {
        assertEquals("Isabel Coixet", director.getName());
    }
    
    @Test
    public void testGetID() {
        assertEquals(0, director.getId());
    }

}
