package demoapp.controller;

import javax.validation.constraints.Min;

public class EsPar {

    @Min(1)
    int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
