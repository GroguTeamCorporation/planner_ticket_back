package dev.plannerticket.Models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name = "events")
public class Event {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String location;
    private int capacity;
    private Date date_event;
    private String time_event;
    private String image;
    
    public Event() {
    }
    
    public Event(Long id, String title, String description, String location, int capacity, Date date_event,
            String time_event, String image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.location = location;
        this.capacity = capacity;
        this.date_event = date_event;
        this.time_event = time_event;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public Date getDate_event() {
        return date_event;
    }
    public void setDate_event(Date date_event) {
        this.date_event = date_event;
    }
    public String getTime_event() {
        return time_event;
    }
    public void setTime_event(String time_event) {
        this.time_event = time_event;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }


    
}
