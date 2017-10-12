package apaw.api.dtos;

import apaw.api.entities.Movie;

public class MovieDto {
    
    private int id;
    private String title;
    private int debut;
    
  
    public MovieDto(){

    }
    
    public MovieDto(Movie movie){
        this.id = movie.getId();
        this.title = movie.getTitle();
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

    public void setDebut(int debut) {
        this.debut = debut;
    }
    
    @Override
    public String toString() {
        return "{\"id\":" + id + ",\"title\":\"" + title + "\"}";
    }
   

}
