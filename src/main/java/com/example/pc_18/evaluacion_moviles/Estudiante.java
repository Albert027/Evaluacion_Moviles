package com.example.pc_18.evaluacion_moviles;

import java.io.Serializable;

/**
 * Created by PC-18 on 16/09/2017.
 */

public class Estudiante implements Serializable{
    public String Nombre;
    public String Codigo;
    public String Materia;
    public Double Parcial1;
    public Double Parcial2;
    public Double Parcial3;
    public Double Promedio;

    public Estudiante(String nombre, String codigo, String materia, Double parcial1, Double parcial2, Double parcial3){
        Nombre = nombre;
        Codigo = codigo;
        Materia = materia;
        Parcial1 = parcial1;
        Parcial2 = parcial2;
        Parcial3 = parcial3;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }

    public Double getParcial1() {
        return Parcial1;
    }

    public void setParcial1(Double parcial1) {
        Parcial1 = parcial1;
    }

    public Double getParcial2() {
        return Parcial2;
    }

    public void setParcial2(Double parcial2) {
        Parcial2 = parcial2;
    }

    public Double getParcial3() {
        return Parcial3;
    }

    public void setParcial3(Double parcial3) {
        Parcial3 = parcial3;
    }

    public Double getPromedio() {
        return Promedio;
    }

    public void setPromedio(Double promedio) {
        Promedio = promedio;
    }
}
