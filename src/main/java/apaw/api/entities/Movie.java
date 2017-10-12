package apaw.api.entities;

public class Movie {
    
    private int id;
    private String title;
    private int debut;
    
  
    public Movie(){

    }
    
    public Movie(String title){
        this.title = title;
        this.debut = 2017;
    }
    
    
    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDebut() {
        return debut;
    }
 
    @Override
    public String toString() {
        return "Movie [id=" + id + ", title=" + title + ", debut=" + debut + "]";
    }

}
