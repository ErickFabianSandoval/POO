package fes.ico.TareaSeis;

import fes.ico.TareaSeis.herenciamultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("area cuadrado = " + cuadrado.calcularArea());

        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("area circulo = " + circulo.calcularArea());

        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Juan");
        ada.setArte("Pintura");
        ada.setDeporte("Basketball");
        System.out.println(ada);
        ada.ensayar("Oleo");
        ada.entrenar();
        ada.presentarCompetencia("Naucalli");
    }
}
