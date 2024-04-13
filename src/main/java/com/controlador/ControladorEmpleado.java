package com.controlador;

import com.modelo.Empleado;
import com.modelo.Liquidacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ControladorEmpleado {

private List<Empleado> listaEmpleados = new ArrayList<>();

    @PostMapping("/empleados")
    public Empleado agregarEmpleado(@RequestBody Empleado empleado) {
        getListaEmpleados().add(empleado);
        return empleado;
    }

    @GetMapping("/empleados")
    public List<Empleado> listarEmpleados() {
        return getListaEmpleados();
    }

    @PostMapping("/empleados/{codigoId}/dias-trabajados")
    public String ingresarDiasTrabajados(@PathVariable int codigoId, @RequestParam int diasTrabajados) {
        Empleado empleado = encontrarEmpleadoPorCodigoId(codigoId);
        if (empleado != null) {
            empleado.setDiasTrabajados(diasTrabajados);
            return "Días trabajados actualizados correctamente para el empleado con código ID: " + codigoId;
        }
        return "Empleado con código ID " + codigoId + " no encontrado";
    }

    @PostMapping("/empleados/{codigoId}/concepto-adicional")
    public String agregarConceptoAdicional(@PathVariable int codigoId, @RequestParam String nombreConcepto, @RequestParam int cantidad, @RequestParam double monto) {
        Empleado empleado = encontrarEmpleadoPorCodigoId(codigoId);
        if (empleado != null) {
            empleado.agregarConceptoAdicional(nombreConcepto, cantidad, monto);
            return "Concepto adicional añadido correctamente para el empleado con código ID: " + codigoId;
        }
        return "Empleado con código ID " + codigoId + " no encontrado";
    }

    @GetMapping("/empleados/{codigoId}/liquidacion")
    public Liquidacion calcularConceptosFijos(@PathVariable int codigoId) {
        Empleado empleado = encontrarEmpleadoPorCodigoId(codigoId);
        if (empleado != null) {
            return empleado.calcularConceptosFijos();
        }
        return null;
    }

    private Empleado encontrarEmpleadoPorCodigoId(int codigoId) {
        for (Empleado empleado : getListaEmpleados()) {
            if (empleado.getCodigoId() == codigoId) {
                return empleado;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SpringApplication.run(ControladorEmpleado.class, args);
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
}