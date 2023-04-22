
package com.portfolioferreyra.nataniel.controller;

import com.portfolioferreyra.nataniel.entity.Proyecto;
import com.portfolioferreyra.nataniel.service.SProyecto;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("proyectos")
@CrossOrigin(origins = "https://portfolionatanielferreyra1.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
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
    public Proyecto buscarProyecto (@PathVariable int id){
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
    

    
    @PutMapping("/update/{id}")
    public void editarProyecto(@RequestBody Proyecto pro) {
        sProyecto.editarProyecto(pro);
    }
    
}
