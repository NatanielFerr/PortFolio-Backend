
package com.portfolioferreyra.nataniel.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.validation.constraints.NotNull;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter @Setter

@Entity
@Table (name = "educaciones")
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nivel;
    private String institucion;
    private String img;
    @Lob
    private String descripcion;
    private String link;
    
    
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date inicio;
    
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date fin;
    
  
    @ManyToOne
    
    @JoinColumn(name = "personaid", insertable=false, updatable=false)
  
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Persona persona;
    
    private Long personaid;

    public Educacion() {
    }

    public Educacion(String nivel, String institucion, String img, String descripcion, String link, Date inicio, Date fin, Persona persona, Long personaid) {
        this.nivel = nivel;
        this.institucion = institucion;
        this.img = img;
        this.descripcion = descripcion;
        this.link = link;
        this.inicio = inicio;
        this.fin = fin;
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
