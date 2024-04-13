package com.modelo;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private int codigoId;
    private String nombreEmpleado;
    private double sueldoBase;
    private double auxilioTransporte;
    private double seguroSalud;
    private double fondoPension;
    private int diasTrabajados;
    private List<ConceptoAdicional> conceptosAdicionales = new ArrayList<>();

    public Empleado() {
    }

    public Empleado(int codigoId, String nombreEmpleado, double sueldoBase, double auxilioTransporte, double seguroSalud, double fondoPension, int diasTrabajados) {
        this.codigoId = codigoId;
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoBase = sueldoBase;
        this.auxilioTransporte = auxilioTransporte;
        this.seguroSalud = seguroSalud;
        this.fondoPension = fondoPension;
        this.diasTrabajados = diasTrabajados;
    }

    public void agregarConceptoAdicional(String nombreConcepto, int cantidad, double monto) {
        getConceptosAdicionales().add(new ConceptoAdicional(nombreConcepto, cantidad, monto));
    }

    public Liquidacion calcularConceptosFijos() {
        double totalSueldo = getSueldoBase() * getDiasTrabajados();
        double totalAuxilioTransporte = getAuxilioTransporte() * getDiasTrabajados();
        double totalSeguroSalud = getSeguroSalud() * getDiasTrabajados();
        double totalFondoPension = getFondoPension() * getDiasTrabajados();
        double totalConceptosAdicionales = 0.0;

        for (ConceptoAdicional conceptoAdicional : getConceptosAdicionales()) {
            totalConceptosAdicionales += conceptoAdicional.getCantidad() * conceptoAdicional.getMonto();
        }

        return new Liquidacion(totalSueldo, totalAuxilioTransporte, totalSeguroSalud, totalFondoPension, totalConceptosAdicionales);
    }

    public int getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(int codigoId) {
        this.codigoId = codigoId;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
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

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public List<ConceptoAdicional> getConceptosAdicionales() {
        return conceptosAdicionales;
    }

    public void setConceptosAdicionales(List<ConceptoAdicional> conceptosAdicionales) {
        this.conceptosAdicionales = conceptosAdicionales;
    }

}