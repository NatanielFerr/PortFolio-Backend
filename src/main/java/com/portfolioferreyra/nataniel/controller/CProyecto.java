
package com.portfolioferreyra.nataniel.controller;

import com.portfolioferreyra.nataniel.entity.Proyecto;
import com.portfolioferreyra.nataniel.service.SProyecto;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("proyectos")
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto {
    @Autowired
    SProyecto sProyecto;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Proyecto> verProyectos(){
        return sProyecto.verProyectos();
    }
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public Proyecto verProyectosid (@PathVariable int id){
        return sProyecto.buscarProyecto(id);
    }
    
    @PostMapping ("/create")
    public String crearProyecto (@RequestBody Proyecto proyec){
        sProyecto.crearProyecto(proyec);
        return "El proyecto fue creado correctamente";
    }
    
    
    
    @DeleteMapping ("/delete/{id}")
    public String borrarProyecto(@PathVariable int id){
        sProyecto.borrarProyecto(id);
        return "El proyecto fue eliminado correctamente";
    }
    
    @PutMapping ("/update/{id}")
    public Proyecto editarProyecto(@PathVariable int id, 
                                 @RequestParam("proyecto") String nuevoProyecto,
                                 @RequestParam("descripcion") String nuevaDescripcion,
                                 @RequestParam("tecnologia") String nuevaTecnologia,
                                 @RequestParam("link") String nuevoLink,
                                 @RequestParam("logo") String nuevoLogo,
                                 @RequestParam("inicio") Date nuevoInicio,
                                 @RequestParam("fin") Date nuevoFin){
        Proyecto pros = sProyecto.buscarProyecto(id);
        
        pros.setProyecto(nuevoProyecto);
        pros.setDescripcion(nuevaDescripcion);
        pros.setTecnologia(nuevaTecnologia);
        pros.setLink(nuevoLink);
        pros.setLogo(nuevoLogo);
        pros.setInicio(nuevoInicio);
        pros.setFin(nuevoFin);
        
        
        sProyecto.crearProyecto(pros);
        return pros;
    }
    
}
