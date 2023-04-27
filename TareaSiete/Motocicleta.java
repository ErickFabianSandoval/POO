package fes.ico.TareaSiete;

public class Motocicleta implements Vehiculo{
    private int centimetroCubicos;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int centimetroCubicos, String marca) {
        this.centimetroCubicos = centimetroCubicos;
        this.marca = marca;
    }

    public int getCentimetroCubicos() {
        return centimetroCubicos;
    }

    public void setCentimetroCubicos(int centimetroCubicos) {
        this.centimetroCubicos = centimetroCubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "centimetroCubicos=" + centimetroCubicos +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void hacerCaballito(){
        System.out.println("Haciendo un caballito para romperme un hueso...");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo la motocicleta de marca " + this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando la motocicleta de marca " + this.marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzando con la motocicleta de " + this.centimetroCubicos + " C.C.");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando con la motocicleta de " + this.centimetroCubicos + " C.C.");
    }
}
