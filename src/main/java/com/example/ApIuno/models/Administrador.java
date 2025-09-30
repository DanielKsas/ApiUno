package com.example.ApIuno.models;

public class Administrador {
    Integer id;
    String position;
    int tiempoExperiencia;
    String especiality;

    public Administrador() {
    }

    public Administrador(Integer id, String position, int tiempoExperiencia, String especiality) {
        this.id = id;
        this.position = position;
        this.tiempoExperiencia = tiempoExperiencia;
        this.especiality = especiality;

    }

    public Integer getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public int getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public String getEspeciality() {
        return especiality;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTiempoExperiencia(int tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

    public void setEspeciality(String especiality) {
        this.especiality = especiality;
    }
}
