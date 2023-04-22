
package com.portfolioferreyra.nataniel.controller;

import com.portfolioferreyra.nataniel.entity.Habilidad;
import com.portfolioferreyra.nataniel.service.SHabilidad;
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
@RequestMapping("habilidades")
@CrossOrigin(origins = "https://portfolionatanielferreyra1.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class CHabilidad {
    @Autowired
    SHabilidad sHabilidad;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Habilidad> verHabilidades(){
        return sHabilidad.verHabilidades();
    }
    
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public Habilidad buscarHabilidad (@PathVariable int id){
        return sHabilidad.buscarHabilidad(id);
    }
    
    @PostMapping ("/create")
    public String crearHabilidad (@RequestBody Habilidad habil){
        sHabilidad.crearHabilidad(habil);
        return "La habilidad fue creada correctamente";
    }
    
    
    
    @DeleteMapping ("/delete/{id}")
    public String borrarHabilidad(@PathVariable int id){
        sHabilidad.borrarHabilidad(id);
        return "La habilidad fue eliminada correctamente";
    }
    
    
    @PutMapping("/update/{id}")
    public void editarHabilidad(@RequestBody Habilidad habi) {
        sHabilidad.editarHabilidad(habi);
    }
}
