package fes.ico.Tarea4;

import java.awt.*;

public class Gato {
    private int patas;
    private Color color;
    private String especie;
    private String nombre;
    private String genero;

    public Gato() {
    }

    public Gato(int patas, Color color, String especie, String nombre, String genero) {
        this.patas = patas;
        this.color = color;
        this.especie = especie;
        this.nombre = nombre;
        this.genero = genero;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "patas=" + patas +
                ", color=" + color +
                ", especie='" + especie + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void caer(){
        boolean dePie = Math.random() > 0.51;
        System.out.println(((dePie) ? "El gato cayo alreves" :"El gato cayo alreves"));
    }
    public void correr(){
        System.out.println("El gato esta corriendo");
    }
    public int edad(){
        int edad = (int)Math.random()*10;
        System.out.println("El gato tiene: " + edad + " años");
        return edad;
    }
}
