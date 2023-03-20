package fes.ico.Tarea4;

import java.awt.*;

public class GatoDriver {
    public static void main(String[] args) {
        Gato michi = new Gato(4, Color.BLACK, "ameriano", "michi", "macho");
        michi.caer();
        michi.correr();
        michi.edad();
        System.out.println(michi);
    }
}
