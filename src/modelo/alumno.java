/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author narut
 */
public class alumno {
    private String nombre;
    private int edad;
    private String carrera;
    private int cuatri;
    private double promedio;

    public alumno(String nombre, int edad, String carrera, int cuatrimestre, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.cuatri = cuatrimestre;
        this.promedio = promedio;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getCuatrimestre() {
        return cuatri;
    }

    public double getPromedio() {
        return promedio;
    }
}
