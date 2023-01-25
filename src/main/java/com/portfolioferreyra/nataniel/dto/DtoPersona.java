
package com.portfolioferreyra.nataniel.dto;

import lombok.Getter;
import lombok.Setter;



@Getter @Setter
public class DtoPersona {
    private String nombre;
    private String apellido;
    private String sobre_mi;
    private String titulo;
    private String imagen;
    private String banner;
    private int edad;
    private String email;
    private String contrasenia;

    public DtoPersona() {
    }

    public DtoPersona(String nombre, String apellido, String sobre_mi, String titulo, String imagen, String banner, int edad, String email, String contrasenia) {
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
