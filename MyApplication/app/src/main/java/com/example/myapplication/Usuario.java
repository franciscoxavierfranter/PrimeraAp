package com.example.myapplication;

public class Usuario {

    private Integer id_usuario;
    private String nombre;
    private String email;
    private int dia;
    private int mes;
    private int anyo;
    private String signo;


    public Usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Usuario(Integer id_usuario, String nombre, String email, int dia, int mes, int anyo, String signo) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.email = email;
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
        this.signo = signo;
    }

    public Usuario(String signo) {
        this.signo = signo;
    }

    @Override
    public String toString(){
        return "Usuario{}";
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.email = signo;
    }

}
