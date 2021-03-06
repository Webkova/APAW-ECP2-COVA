package apaw.api.daos.memory;

import java.util.HashMap;

import apaw.api.daos.DirectorDao;
import apaw.api.entities.Director;

public class DirectorDaoMemory extends GenericDaoMemory<Director> implements DirectorDao {

    public DirectorDaoMemory() {
        this.setMap(new HashMap<Integer, Director>());
    }

    @Override
    protected Integer getId(Director entity) {
        return entity.getId();
    }

    @Override
    protected void setId(Director entity, Integer id) {
        entity.setId(id);

    }

}
