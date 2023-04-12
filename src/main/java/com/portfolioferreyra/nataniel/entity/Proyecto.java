
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
@Table (name = "proyectos")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String proyecto;
    @Lob
    private String descripcion;
    private String tecnologia;
    private String link;
    private String logo;
    
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date inicio;
    
    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date fin;
    
    @ManyToOne
    
    @JoinColumn(name = "personaid", insertable=false, updatable=false)
  
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Persona persona;
    
    private Long personaid;

    public Proyecto() {
    }

    public Proyecto(String proyecto, String descripcion, String tecnologia, String link, String logo, Date inicio, Date fin, Persona persona, Long personaid) {
        this.proyecto = proyecto;
        this.descripcion = descripcion;
        this.tecnologia = tecnologia;
        this.link = link;
        this.logo = logo;
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
