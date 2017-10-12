package apaw.api.dtos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DirectorDtoTest {

 DirectorDto director = new DirectorDto();
    
    @Before
    public void movieSetters(){
        director.setName("Denis Villeneuve");
        director.setId(3);
        director.setLevel(9);
    }
    
    @Test
    public void testGetLevel() {
        assertEquals(9, director.getLevel());
    }
    
    @Test
    public void testGetName() {
        assertEquals("Denis Villeneuve", director.getName());
    }
    
    @Test
    public void testGetID() {
        assertEquals(3, director.getId());
    }
}
