package org.dmo.local;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "comunas")
public class Comuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //getters and setters
    private Integer id;
    private String nombre;

    public Integer getId() { return id;}
    public void setId(Integer id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Comuna comunas = (Comuna) o;
        return Objects.equals(id, comunas.id) && Objects.equals(nombre, comunas.nombre) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }


}




