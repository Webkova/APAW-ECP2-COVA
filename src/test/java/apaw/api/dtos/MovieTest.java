package apaw.api.dtos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MovieTest {
    

    @Test
    public void testGetDate() {
        assertEquals(1, new MovieDto(1).getId());
    }

}
