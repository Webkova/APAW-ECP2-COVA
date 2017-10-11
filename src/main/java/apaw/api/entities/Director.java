package apaw.api.entities;

public class Director {
    
    public int id;
    public String name;
    public int level;
    
    public Director(){

    }
    
    public Director(int id){
        this.id = id;
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

}
