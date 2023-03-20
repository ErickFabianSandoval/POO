package fes.ico.Tarea4;

import java.awt.*;

public class DriverApagador {
    public static void main(String[] args) {
        Apagador apag1 = new Apagador(true, "Steren", 3, Color.BLUE, "Europeo");
        apag1.encender();
        apag1.conectar();
        apag1.numeroEnchufes();
        System.out.println(apag1);
    }


}
