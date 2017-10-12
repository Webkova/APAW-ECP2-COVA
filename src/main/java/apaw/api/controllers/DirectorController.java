package apaw.api.controllers;

import java.util.Optional;

import apaw.api.daos.DaoFactory;
import apaw.api.dtos.DirectorDto;
import apaw.api.entities.Director;

public class DirectorController {
    
    private boolean existDirectorId(int directorId) {
        return DaoFactory.getFactory().getDirectorDao().read(directorId) != null;
    }

    public void createDirector(String directorName) {
        DaoFactory.getFactory().getDirectorDao().create(new Director(directorName));
    }
    
    public Optional<DirectorDto> readDirector(int directorId) {
        if (existDirectorId(directorId)) {
             return Optional.of(new DirectorDto(DaoFactory.getFactory().getDirectorDao().read(directorId)));
         } else {
             return Optional.empty();
         }
     }
 }


