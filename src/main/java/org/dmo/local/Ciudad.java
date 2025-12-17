package org.dmo.local;
import jakarta.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "ciudades")

public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idciudades;
    private String nombre;

    //Getters and Setters
    public Integer getIdciudades() {return idciudades;}
    public void setIdciudades(Integer idciudades) {this.idciudades = idciudades;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ciudad ciudades = (Ciudad) o;
        return Objects.equals(idciudades, ciudades.idciudades) && Objects.equals(nombre, ciudades.nombre) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idciudades, nombre);
    }

}
