package com.example.ApIuno.models;

import jakarta.persistence.*;

@Entity
@Table(name = "jugadores")
public class Jugador {
    private   Integer id;
    private   int timePlayed;
    private   String ranking;
    private   String description;
    private   String imageUser;

    public Jugador() {
    }

    public Jugador(Integer id, int timePlayed, String ranking, String description, String imageUser) {
        this.id = id;
        this.timePlayed = timePlayed;
        this.ranking = ranking;
        this.description = description;
        this.imageUser = imageUser;
    }

    public Integer getId() {
        return id;
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    public String getRanking() {
        return ranking;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUser() {
        return imageUser;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTimePlayed(int timePlayed) {
        this.timePlayed = timePlayed;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUser(String imageUser) {
        this.imageUser = imageUser;
    }


}
