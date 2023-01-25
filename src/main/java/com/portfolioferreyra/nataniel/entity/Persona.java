
package com.portfolioferreyra.nataniel.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
    private int id;
    private String nombre;
    private String apellido;
    private String sobre_mi;
    private String titulo;
    private String imagen;
    private String banner;
    private int edad;
 
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

    public Persona() {
    }

    
    public Persona(String nombre, String apellido, String sobre_mi, String titulo, String imagen, String banner, int edad, String email, String contrasenia, List<Red> redes, List<Educacion> educaciones, List<Experiencia> experiencias, List<Proyecto> proyectos, List<Habilidad> habilidades) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sobre_mi = sobre_mi;
        this.titulo = titulo;
        this.imagen = imagen;
        this.banner = banner;
        this.edad = edad;
        this.email = email;
        this.contrasenia = contrasenia;
    }
    
   
}
