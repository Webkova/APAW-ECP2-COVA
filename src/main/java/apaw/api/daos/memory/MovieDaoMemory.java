package apaw.api.daos.memory;

import java.util.HashMap;

import apaw.api.daos.MovieDao;
import apaw.api.entities.Movie;

public class MovieDaoMemory extends GenericDaoMemory<Movie> implements MovieDao {

    public MovieDaoMemory() {
        this.setMap(new HashMap<Integer, Movie>());
    }

    @Override
    protected int getId(Movie entity) {
        return entity.getId();
    }

    @Override
    protected void setId(Movie entity, int id) {
        entity.setId(id);

    }

}
