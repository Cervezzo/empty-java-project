package com.teaching.android;

public class Persona {

    //Atributos
    private String nombre;
    private float dinero;

    //constructor
    public Persona(String nombre, float dinero){
        this.nombre = nombre;
        this.dinero = dinero;
    }
    //métodos
    public void pagar(Persona p, float cantidad) {
        this.dinero = this.dinero + cantidad;
        p.dinero = p.dinero - cantidad;
        System.out.println(p.nombre + " " + "ha pagado a " +  this.nombre + " la cantidad de: " + cantidad);
    }
    public String getNombre(){
        return nombre;
    }
    public float getDinero() {
        return dinero;
    }
}


