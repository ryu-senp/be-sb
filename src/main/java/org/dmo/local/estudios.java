package org.dmo.local;
import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "estudios")
public class estudios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String titulo;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_termino")
    private LocalDate fechaTermino;

    private String descripcion;

    //getter Setter
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNombre() {return nombre;}
    public void setNombre(){this.nombre = nombre;}

    public String getTitulo() {return titulo;}
    public void setTitulo() {this.titulo = titulo;}

    public LocalDate getFechaInicio() {return fechaInicio;}
    public void setFechaInicio() {this.fechaInicio = fechaInicio;}

    public LocalDate getFechaTermino() {return fechaTermino;}
    public void setFechaTermino() {this.fechaTermino = fechaTermino;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
}
