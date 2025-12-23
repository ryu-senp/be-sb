package org.dmo.local;
import jakarta.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "ciudades")

public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idciudades")


    private Integer idciudades;
    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;



    //Getters and Setters
    public Integer getIdciudades() {return idciudades;}
    public void setIdciudades(Integer idciudades) {this.idciudades = idciudades;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}


    @Override
    public String toString(){
        return "Ciudad{" + "idciudades=" + idciudades + ", nombre=" + nombre + '}';
    }
}



