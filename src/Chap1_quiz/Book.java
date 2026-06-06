package Chap1_quiz;

import java.util.*;
import java.util.Objects;
import java.util.Date;

public class Book implements Comparable<Book>,Cloneable{
    private String title;
    private Date publishDate;
    private String comment;

public Book(String title, Date publishDate,String comment){
    this.title = title;
    this.publishDate = publishDate;
    this.comment = comment;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title,book.title)&&
                Objects.equals(publishDate,book.publishDate);
    }
    public int hashCode(){
        return Objects.hash(title,publishDate);
    }
    public int compareTo(Book o){
    return this.publishDate.compareTo(o.publishDate);
    }
    public Book clone() {
        try {
            Book result = (Book) super.clone();
            result.publishDate = (Date) this.publishDate.clone();

            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    public String getTitle(){
    return this.title;
}
public String getComment(){
    return this.comment;
}
    }

