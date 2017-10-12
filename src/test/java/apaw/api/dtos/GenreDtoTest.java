package apaw.api.dtos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GenreDtoTest {

 GenreDto genre = new GenreDto();
    
    @Before
    public void movieSetters(){
        genre.setName("ACTION");
        genre.setId(3);
    }
    
    @Test
    public void testGetName() {
        assertEquals("ACTION", genre.getName());
    }
    
    @Test
    public void testGetID() {
        assertEquals(3, genre.getId());
    }
}
