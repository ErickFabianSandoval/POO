package org.example;

import java.util.Scanner;
public class TareaUno {
        public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                String cadena;

                System.out.print("Introduce un nombre, profesion y país: ");
                cadena = teclado.nextLine();

                String[] separado = cadena.split(" ");

                for(int i = 0;i <= separado.length;i++){
                        if(i==0){
                                System.out.println("Nombre: " + separado[i]);
                        }
                        if(i==1){
                                System.out.println("Profesion: " + separado[i]);
                        }
                        if(i==2){
                                System.out.println("Pais: " + separado[i]);
                        }
                }
        }
}

