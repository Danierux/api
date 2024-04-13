package com.modelo;

public class Liquidacion {
    private double salario;
    private double auxilioTransporte;
    private double seguroSalud;
    private double fondoPension;
    private double totalConceptosAdicionales;

    public Liquidacion() {
    }

    public Liquidacion(double salario, double auxilioTransporte, double seguroSalud, double fondoPension, double totalConceptosAdicionales) {
        this.salario = salario;
        this.auxilioTransporte = auxilioTransporte;
        this.seguroSalud = seguroSalud;
        this.fondoPension = fondoPension;
        this.totalConceptosAdicionales = totalConceptosAdicionales;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(double auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public double getSeguroSalud() {
        return seguroSalud;
    }

    public void setSeguroSalud(double seguroSalud) {
        this.seguroSalud = seguroSalud;
    }

    public double getFondoPension() {
        return fondoPension;
    }

    public void setFondoPension(double fondoPension) {
        this.fondoPension = fondoPension;
    }

    public double getTotalConceptosAdicionales() {
        return totalConceptosAdicionales;
    }

    public void setTotalConceptosAdicionales(double totalConceptosAdicionales) {
        this.totalConceptosAdicionales = totalConceptosAdicionales;
    }

}