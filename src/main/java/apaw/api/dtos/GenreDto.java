package apaw.api.dtos;

import apaw.api.entities.Genre;


public class GenreDto {

    private int id;
    private String name;
    
  
    public GenreDto(){

    }
    
    public GenreDto(Genre genre){
        this.id = genre.getId();
        this.name = genre.getName();
    }
    
    
    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "{\"id\":" + id + ",\"name\":\"" + name + "\"}";
    }
}
