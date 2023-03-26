package fes.ico.TareaCinco;

import java.util.Scanner;

public class CafeteraDriver {
    public static void main(String[] args) {
        Cafetera cafe1 = new Cafetera(Cafetera.LTS_AGUA, Cafetera.KG_CAFE, Cafetera.LTS_AGUA, Cafetera.NUM_VASOS);
        Scanner teclado = new Scanner(System.in);
        int opcion;
        char continuar = 's';

        while(continuar == 's' || continuar == 'S') {
            System.out.println("¿Que café desea preparar? ");
            System.out.println("1.Americano\n" +
                    "2.Expreso\n" +
                    "3.Capuchino");
            System.out.print("\nElija una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    cafe1.americano();
                    break;
                case 2:
                    cafe1.expreso();
                    break;
                case 3:
                    cafe1.capuchino();
            }

            System.out.println("\n¿Desea ordenar otro cafe? s/n");
            continuar = teclado.next().charAt(0);

            if(continuar!= 's' || continuar != 'S'){
                System.out.println("\nGracias por su preferencia");
            }

        }

        //metodos de rellenado
        System.out.println("\nActualmente la maquina posee: ");
        cafe1.estadoActual();

        //rellenar solo algunos contenedores
        cafe1.refillAgua();
        cafe1.refillCafe();
        System.out.println("El cafe y el agua ha sido rellenado");
        cafe1.estadoActual();

        //rellenar todos los contenedores
        cafe1.refillTodo();
        System.out.println("La maquina ha sido rellena: ");
        cafe1.estadoActual();
    }
}
