
package com.portfolioferreyra.nataniel.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoHabilidad {
    private String habilidad;
    private int porcentaje;
    
    public DtoHabilidad() {
    }

    public DtoHabilidad(String habilidad, int porcentaje) {
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
    }
}
