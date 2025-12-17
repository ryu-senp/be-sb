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
    public String toString() {
        return "Comuna{" + "id=" + id + ", nombre=" + nombre + '}';
    }


}




