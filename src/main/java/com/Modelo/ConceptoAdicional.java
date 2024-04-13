package com.modelo;

import java.util.ArrayList;
import java.util.List;

public class ConceptoAdicional {

    private String nombreConcepto;
    private int cantidad;
    private double monto;

    public ConceptoAdicional() {
    }

    public ConceptoAdicional(String nombreConcepto, int cantidad, double monto) {
        this.nombreConcepto = nombreConcepto;
        this.cantidad = cantidad;
        this.monto = monto;
    }

    public String getNombreConcepto() {
        return nombreConcepto;
    }

    public void setNombreConcepto(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
