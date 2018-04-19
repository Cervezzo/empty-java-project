package com.teaching.android;

// El comando '\n' crea un salto en pantalla, hay que escribirlo siempre entre comillas.

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {


       /* Persona p1 = new Persona("Paco", 200f);
        Persona p2 = new Persona("Juan", 400f);

        System.out.println("\n Paco tenía inicialmente " + p1.getDinero());
        System.out.println("Juan tenía inicialmente " + p2.getDinero() + "\n");

        p1.pagar(p2, 20f);

        System.out.println("\n" + p1.getNombre() + " ahora tiene " + p1.getDinero());
        System.out.println(p2.getNombre() + " ahora tiene " + p2.getDinero());

*/


        /*"Ejercicio Par o Impar."

       Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserte un número:");
       int valor = keyboard.nextInt();



       if (valor%2 == 0){
           System.out.println("El número introducido es par.");
       }

       else {
           System.out.println("El número introducido es impar");
       }
        */



        //Ejercicio adivinar número en tres intentos.


      /*  Random generator = new Random();
        int random = generator.nextInt(10) + 1;

        for (int numIn = 0; numIn <= 2; numIn += 1) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserta número: ");
        int valor = keyboard.nextInt();

            if (valor == random) {
                System.out.println("Es correcto!!");
            break;
            }

            if (valor < random) {
                System.out.println("Más alto!");
            } else {
                System.out.println("Menos!!");
            }
        }
        */


      /*Haz un programa que al introducir un número, una operación y otro número, realice el cálculo
        y lo muestre por pantalla.*/


      /*for (int numIn = 0; numIn <= 4; numIn += 1) {
          Scanner keyboard = new Scanner(System.in);
          System.out.println("Inserte su operación:");
          float valor = keyboard.nextInt();

          */

        Punto p1 = new Punto(2, 4);
        Punto p2 = new Punto(3, 5);

        double distancia = p1.distancia(3,5);
        System.out.println(distancia);

        double pDestino = p2.distancia( 2, 4);
        System.out.println(distancia);

        System.out.println(p1);
      }

    }

















