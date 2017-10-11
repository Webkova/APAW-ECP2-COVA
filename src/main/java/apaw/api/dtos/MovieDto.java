package apaw.api.dtos;

public class MovieDto {
    
    private int id;
    private String title;
    private int debut;
    
  
    public MovieDto(){

    }
    
    public MovieDto(int id){
        this.id = id;
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
   

}
