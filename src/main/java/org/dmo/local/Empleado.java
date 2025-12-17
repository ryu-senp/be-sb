package org.dmo.local;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String apellido;
    private String rut;

    public Empleado() {}

    // getters y setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString(){
        return "Empleado{"  + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Empleado empleado = (Empleado) o;
//        return Objects.equals(id, empleado.id) && Objects.equals(nombre, empleado.nombre) && Objects.equals(apellido, empleado.apellido) && Objects.equals(rut, empleado.rut);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, nombre, apellido, rut);
//    }
}