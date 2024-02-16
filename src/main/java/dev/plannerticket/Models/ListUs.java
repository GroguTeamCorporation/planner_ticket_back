package dev.plannerticket.Models;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "list_us")
public class ListUs {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_us")
    private Long id;
    private String title;
    private Date date;
    private String image;

    // Assuming that 'listUs' is a reference to another entity with a one-to-many relationship
    @ManyToOne
    @JoinColumn(name = "user_id") // This should be the name of the foreign key column in the 'list_us' table
    private User user; // This should be the type of the related entity

    public ListUs() {
    }

    public ListUs(Long id, String title, Date date, String image) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.image = image;
    }

    
   
      
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
  
    
}
