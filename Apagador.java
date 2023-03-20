package fes.ico.Tarea4;

import java.awt.Color;

public class Apagador {
    private boolean encendido;
    private String marca;
    private int enchufes;
    private Color color;
    private String modelo;

    public Apagador() {
    }

    public Apagador(boolean encendido, String marca, int enchufes, Color color, String modelo) {
        this.encendido = encendido;
        this.marca = marca;
        this.enchufes = enchufes;
        this.color = color;
        this.modelo = modelo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEnchufes() {
        return enchufes;
    }

    public void setEnchufes(int enchufes) {
        this.enchufes = enchufes;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Apagador{" +
                "encendido=" + encendido +
                ", marca='" + marca + '\'' +
                ", enchufes=" + enchufes +
                ", color=" + color +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public boolean encender(){
        boolean encendido = Math.random() > 0.51;
        System.out.println("El apagador esta encendido: " + encendido);
        return encendido;
    }
    public void conectar(){
        System.out.println("Ha conectado un cable al enchufe");
    }
    public int numeroEnchufes(){
        int enchufes = (int)Math.random()*10;
        System.out.println("El apagador tiene: " + enchufes + " enchufes");
        return enchufes;
    }
}
