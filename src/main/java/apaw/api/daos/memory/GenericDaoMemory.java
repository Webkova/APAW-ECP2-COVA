package apaw.api.daos.memory;

import java.util.Map;

import apaw.api.daos.GenericDao;

public abstract class GenericDaoMemory<T> implements GenericDao<T, Integer> {

    private Map<Integer, T> map;

    private Integer id;

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
    
    @Override
    public T read(Integer id) {
//        System.out.println("T read T read T read T read " + id + "" + map.get(id));
        return map.get(id);
    }

   
    protected abstract Integer getId(T entity);

    protected abstract void setId(T entity, Integer id);

}
