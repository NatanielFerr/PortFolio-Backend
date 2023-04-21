
package com.portfolioferreyra.nataniel.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter

@Entity
@Table (name = "personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    private String nombre;
    @NotNull
    private String apellido;
    @Lob
    private String sobre_mi;
    @NotNull
    private String titulo;
    
    @NotNull
    private String imagen;
    
    private String banner;
    
 
    @Lob
    private String email;
    
    private String contrasenia;


    @OneToMany
    private List<Habilidad> habilidades = new ArrayList();
    
    @OneToMany
    private List<Proyecto> proyectos = new ArrayList();
 
    @OneToMany
    private List<Experiencia> experiencias = new ArrayList();

    @OneToMany
    private List<Educacion> educaciones = new ArrayList();
    
    @OneToMany
    private List<Red> redes = new ArrayList();
    
    @OneToMany
    private List<Cv> cvs = new ArrayList();

    public Persona() {
    }

    
    public Persona(String nombre, String apellido, String sobre_mi, String titulo, String imagen, String banner, String email, String contrasenia, List<Red> redes, List<Educacion> educaciones, List<Experiencia> experiencias, List<Proyecto> proyectos, List<Habilidad> habilidades,List<Cv> cvs) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sobre_mi = sobre_mi;
        this.titulo = titulo;
        this.imagen = imagen;
        this.banner = banner;
        this.email = email;
        this.contrasenia = contrasenia;
    }
    
   
}
