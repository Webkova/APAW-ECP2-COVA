package apaw.api.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MovieTest {
    

    @Test
    public void testGetDate() {
        assertEquals(1, new Movie(1).getId());
    }

}
