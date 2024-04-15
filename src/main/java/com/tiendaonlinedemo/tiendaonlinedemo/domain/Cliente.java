package com.tiendaonlinedemo.tiendaonlinedemo.domain;

public class Cliente {

    private String userName;
    private String paswoord;
    private String nombre;

    public Cliente(String userName, String paswoord, String nombre) {
        this.userName = userName;
        this.paswoord = paswoord;
        this.nombre = nombre;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPaswoord() {
        return paswoord;
    }

    public void setPaswoord(String paswoord) {
        this.paswoord = paswoord;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
