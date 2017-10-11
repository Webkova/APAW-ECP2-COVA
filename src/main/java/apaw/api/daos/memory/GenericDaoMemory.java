package apaw.api.daos.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import apaw.api.daos.GenericDao;

public abstract class GenericDaoMemory<T> implements GenericDao<T, Integer> {

    private Map<Integer, T> map;

    private int id;

    public GenericDaoMemory() {
        id=0;
    }

    protected void setMap(Map<Integer, T> map) {
        this.map = map;
    }

    @Override
    public void create(T entity) {
        map.put(id, entity);
        this.setId(entity, id);
        id++;
    }

   
    protected abstract int getId(T entity);

    protected abstract void setId(T entity, int id);

}
