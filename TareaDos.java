/*
Alumno: Fabian Sandoval Erick Jose
Fecha: 25 de Febrero 2023  Hora: 3.00 pm
Tarea Dos: ASCII
*/
package fes.ico;

import java.util.Scanner;

public class TareaDos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        int x = 0;
        boolean consecutivo;

        System.out.print("Ingresa un texto: ");
        String input = teclado.nextLine();


        Integer [] enteros = new Integer[input.length()];

        //asignar valores char dentro del arreglo enteros
        for(int i = 0; i < input.length();i++){
            enteros[i] = (int)input.charAt(i);
        }

        //comparador
        while(enteros[x] < enteros[x+1]){
            x++;
            if(x == (enteros.length-1)){
                break;
            }

        }
        if(x == (enteros.length-1)){
            consecutivo = true;
            System.out.println("==> " + consecutivo);
        }
        else{
            consecutivo = false;
            System.out.println("==> " + consecutivo);
        }
    }

}
