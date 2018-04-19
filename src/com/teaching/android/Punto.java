package com.teaching.android;


public class Punto {

    //formula: <Math.sqrt();> de raiz cuadrada.
    //atributos
    private int x;
    private int y;

    //constructor vacío.

    public Punto() {

    }

    //constructor.
    public Punto(int pX, int pY) {
        x = pX;
        y = pY;
    }

    public double distancia(int pX, int pY) {
        int diferenciaX = pX - x;
        int diferenciaY = pY - y;
        double diferenciaXElevado = Math.pow(diferenciaX, 2);
        double diferenciaYElevado = Math.pow(diferenciaY, 2);
        double sumaDiferencias = diferenciaXElevado + diferenciaYElevado;
        double resultado = Math.sqrt(sumaDiferencias);

        return resultado;
    }
    public double distancia(Punto pDestino){
            int diferenciaX = pDestino.x - x;
            int diferenciaY = pDestino.y - y;
            double diferenciaXElevado = Math.pow(diferenciaX, 2);
            double diferenciaYElevado = Math.pow(diferenciaY, 2);
            double sumaDiferencias = diferenciaXElevado + diferenciaYElevado;
            double resultado = Math.sqrt(sumaDiferencias);

            return resultado;

        }




    //set y get
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int pX) {
        x = pX;
    }

    public void setY(int pY) {
        y = pY;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}




