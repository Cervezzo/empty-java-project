package com.teaching.android;

public class Circulo {

    //atributos
    private Punto centro;
    private int radio;

    //constructor
    public Circulo(){

    }
    public Circulo(int pX,int pY, int pRadio){
      this.centro = new Punto(pX, pY); //<<<--composición
      this.radio = pRadio;
    }
    public Circulo(Punto pCentro, int pRadio){
        radio = pRadio;
        centro = pCentro;
    }

    //Métodos

//getter y setter
    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getArea(){
        double area = Math.PI * Math.pow(radio, 2); //return Math.PI * Math.pow(radio, 2);
        return area;                                //es la mejor forma.
    }

    public double getCircumference(){
        double circunferencia = Math.PI * radio * 2;
        return circunferencia;
    }

    @Override
    public String toString() {
        return "Circulo con {" +
                "centro en " + centro +
                " y radio " + radio +
                '}';
    }
}
