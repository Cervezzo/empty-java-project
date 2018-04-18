package com.teaching.android;


import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        Persona p1 = new Persona("Paco", 200f);
        Persona p2 = new Persona("Juan", 400f);
            System.out.println();
        System.out.println("Paco tenía inicialmente " + p1.getDinero());
        System.out.println("Juan tenía inicialmente " + p2.getDinero());

            p1.pagar(p2, 20f);
            System.out.println();
        System.out.println("Paco ahora tiene " + p1.getDinero());
        System.out.println("Juan ahora tiene " + p2.getDinero());

        }


    }
















