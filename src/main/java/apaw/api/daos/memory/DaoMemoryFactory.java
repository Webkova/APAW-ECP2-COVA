package apaw.api.daos.memory;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.DirectorDao;
import apaw.api.daos.MovieDao;


public class DaoMemoryFactory extends DaoFactory {

    private MovieDao movieDao;
    private DirectorDao directorDao;

    @Override
    public MovieDao getMovieDao() {
        if (movieDao == null) {
            movieDao = new MovieDaoMemory();
        }
        return movieDao;
    }

    @Override
    public DirectorDao getDirectorDao() {
        if (directorDao == null) {
            directorDao = new DirectorDaoMemory();
        }
        return directorDao;
    }





}
