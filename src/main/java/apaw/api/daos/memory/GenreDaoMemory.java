package apaw.api.daos.memory;

import java.util.HashMap;

import apaw.api.daos.GenreDao;
import apaw.api.entities.Genre;

public class GenreDaoMemory extends GenericDaoMemory<Genre> implements GenreDao{

    public GenreDaoMemory() {
        this.setMap(new HashMap<Integer, Genre>());
    }

    @Override
    protected Integer getId(Genre entity) {
        return entity.getId();
    }

    @Override
    protected void setId(Genre entity, Integer id) {
        entity.setId(id);  
    }
}
