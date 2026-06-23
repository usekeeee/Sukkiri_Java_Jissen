package Chap14_quiz;
import java.time.LocalDate;

public class Movie {
    private String title;
    private LocalDate releaseDate;

    public Movie() {
    }
       public Movie(String title){
      setTitle(title);
   }

   public String getTitle(){
        return this.title;
   }
   public void setTitle(String title){
        if(title == null){
            throw new IllegalArgumentException();
        }
        this.title = title;
   }
   public LocalDate getReleaseDate(){
        return this.releaseDate;
   }
   public void setReleaseDate(LocalDate releaseDate){
        if(releaseDate == null){
            throw new IllegalArgumentException();
        }
        if(releaseDate.isAfter(LocalDate.now())){
            throw new IllegalArgumentException();
        }
        this.releaseDate =  releaseDate;
   }
}
