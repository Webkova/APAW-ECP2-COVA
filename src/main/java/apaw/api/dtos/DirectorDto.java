package apaw.api.dtos;

import apaw.api.entities.Director;

public class DirectorDto {

    private int id;

    private String name;

    private int level;
    

    public DirectorDto() {

    }

    public DirectorDto(Director director) {
        this.id = director.getId();
        this.name = director.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }


    @Override
    public String toString() {
        return "{\"id\":" + id + ",\"name\":\"" + name + "\"}";
    }

}
