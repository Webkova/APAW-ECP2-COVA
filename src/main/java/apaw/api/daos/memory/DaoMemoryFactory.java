package apaw.api.daos.memory;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.MovieDao;


public class DaoMemoryFactory extends DaoFactory {

    private MovieDao movieDao;

    @Override
    public MovieDao getMovieDao() {
        if (movieDao == null) {
            movieDao = new MovieDaoMemory();
        }
        return movieDao;
    }





}
