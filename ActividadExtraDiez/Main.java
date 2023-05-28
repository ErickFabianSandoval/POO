package fes.ico.ActividadExtraDiez;

import fes.ico.ActividadExtraDiez.controlador.ControladorEjemplo;
import fes.ico.ActividadExtraDiez.vista.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana ventana = new Ventana("Ejemplo JOption Pane");
        ControladorEjemplo controller = new ControladorEjemplo(ventana);
    }
}
