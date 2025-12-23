package org.dmo.local;
import jakarta.persistence.*;

@Entity
@Table(name = "comunas")
public class Comuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String nombre;

//    @ManyToOne(optional = false, fetch = FetchType.LAZY)
//    @JoinColumn(name = "ciudad_id")
//    private Ciudad ciudad;

    // getters & setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

//    public Ciudad getCiudad() { return ciudad; }
//    public void setCiudad(Ciudad ciudad) { this.ciudad = ciudad; }
//    @Override
//    public String toString() {
//        return "Comuna{" +
//                "id=" + id +
//                ", nombre='" + nombre + '\'' +
//                '}';
//    }
}





