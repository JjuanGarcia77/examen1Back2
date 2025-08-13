package com.example.Examen1Back2.modelos;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "docente")
public class Docente {

                                        //--------CAMPOS-------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "especialidad", nullable = false, length = 30)
    private String especialidad;

                                        //-------RELACIONES-------

    @OneToMany(mappedBy = "docente")
    @JsonManagedReference(value = "docente-curso")
    private List<Curso> cursos;

    @OneToOne
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id")
    @JsonManagedReference(value = "docente-usuario")
    private Usuario usuario;

                                        //-------CONSTRUCTORES-----

    public Docente() {
    }

    public Docente(Integer id, String especialidad, List<Curso> cursos, Usuario usuario) {
        this.id = id;
        this.especialidad = especialidad;
        this.cursos = cursos;
        this.usuario = usuario;
    }

                                        //------GET Y SET------

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}