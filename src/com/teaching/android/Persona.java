package com.teaching.android;

public class Persona {

    //Atributos
    private String Nombre;
    private float Dinero;

    //Métodos
    public Persona(String Nombre, float Dinero){
        this.Nombre = Nombre;
        this.Dinero = Dinero;
    }
    public void pagar(Persona p, float cantidad) {
        this.Dinero = this.Dinero + cantidad;
        p.Dinero = p.Dinero - cantidad;
    }

    public float getDinero() {
        return Dinero;
    }
}


