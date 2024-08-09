package com.tcna.holamundo.request;

public class Kia extends Vehiculo implements Opciones{
    @Override
    void avanzar() {
        System.out.println("Avanza despacio");
    }

    @Override
    public void pintar() {

    }

    @Override
    public void hacerRuido() {

    }
}
