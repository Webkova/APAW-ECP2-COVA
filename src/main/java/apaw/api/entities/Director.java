package apaw.api.entities;

public class Director {

    private int id;

    private String name;

    private int level;

    public Director() {

    }

    public Director(String name) {
        this.name = name;
        this.level = 9;
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

    @Override
    public String toString() {
        return "Director [id=" + id + ", name=" + name + ", level=" + level + "]";
    }

}
