package apaw.api.dtos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import apaw.api.dtos.MovieDto;

public class MovieDtoTest {

    MovieDto movie = new MovieDto();
    
    @Before
    public void movieSetters(){
        movie.setTitle("Star Wars: Episode IV - A New Hope");
        movie.setId(3);
        movie.setDebut(1977);
    }
    
    @Test
    public void testGetDebut() {
        assertEquals(1977, movie.getDebut());
    }
    
    @Test
    public void testGetTitle() {
        assertEquals("Star Wars: Episode IV - A New Hope", movie.getTitle());
    }
    
    @Test
    public void testGetID() {
        assertEquals(3, movie.getId());
    }
}
