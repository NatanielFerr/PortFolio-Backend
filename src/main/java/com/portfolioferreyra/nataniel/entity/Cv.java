
package com.portfolioferreyra.nataniel.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter @Setter

@Entity
@Table (name = "cvs")
public class Cv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
   private String link;
   private String anio_derechos;
   private String nombre;
            
  
    @ManyToOne
    
    @JoinColumn(name = "personaid", insertable=false, updatable=false)
  
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Persona persona;
    
    private Long personaid;

    public Cv() {
    }

    public Cv(int id, String link, String anio_derechos, String nombre, Persona persona, Long personaid) {
        this.id = id;
        this.link = link;
        this.anio_derechos = anio_derechos;
        this.nombre = nombre;
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
