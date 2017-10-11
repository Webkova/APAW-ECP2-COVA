package apaw.api.dtos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import apaw.api.entities.Movie;

public class MovieTest {

    @Test
    public void testGetId() {
        Movie movie = new Movie(1);
        assertEquals(1, movie.getId());
    }

}
