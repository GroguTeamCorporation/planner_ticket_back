package dev.plannerticket.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_artist;
    private String name;
    public Long getId_artist() {
        return id_artist;
    }
    public void setId_artist(Long id_artist) {
        this.id_artist = id_artist;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    

    
}
