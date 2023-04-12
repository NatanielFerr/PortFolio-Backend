
package com.portfolioferreyra.nataniel.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter @Setter

@Entity
@Table (name = "habilidades")
public class Habilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nombre;
    private String logo;
    @NotNull
    @Min(0)
    @Max(100)
    private Long porcentaje;
    
  
    @ManyToOne
    
    @JoinColumn(name = "personaid", insertable=false, updatable=false)
  
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Persona persona;
    
    private Long personaid;

    public Habilidad() {
    }

    public Habilidad(String nombre, String logo, Long porcentaje, Persona persona, Long personaid) {
        this.nombre = nombre;
        this.logo = logo;
        this.porcentaje = porcentaje;
        this.persona = persona;
        this.personaid = personaid;
    }

   
     //Opción para que no haga un bug
    @JsonBackReference
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Long getPersonaid() {
        return personaid;
    }

    public void setPersonaid(Long personaid) {
        this.personaid = personaid;
    }
    
    
}
