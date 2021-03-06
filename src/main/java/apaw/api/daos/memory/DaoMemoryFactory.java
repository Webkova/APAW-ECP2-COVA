package apaw.api.daos.memory;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.DirectorDao;
import apaw.api.daos.GenreDao;
import apaw.api.daos.MovieDao;


public class DaoMemoryFactory extends DaoFactory {

    private MovieDao movieDao;
    private DirectorDao directorDao;
    private GenreDao genreDao;

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

    @Override
    public GenreDao getGenreDao() {
        if (genreDao == null) {
            genreDao = new GenreDaoMemory();
        }
        return genreDao;
    }





}
