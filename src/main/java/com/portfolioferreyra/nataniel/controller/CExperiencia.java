
package com.portfolioferreyra.nataniel.controller;

import com.portfolioferreyra.nataniel.entity.Experiencia;
import com.portfolioferreyra.nataniel.service.SExperiencia;
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
@RequestMapping("experiencias")
@CrossOrigin(origins = "https://portfolionatanielferreyra1.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    @Autowired
    SExperiencia sExperiencia;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Experiencia> verExperiencias(){
        return sExperiencia.verExperiencias();
    }
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public Experiencia buscarExperiencia (@PathVariable int id){
        return sExperiencia.buscarExperiencia(id);
    }
    
    @PostMapping ("/create")
    public String crearExperiencia (@RequestBody Experiencia exper){
        sExperiencia.crearExperiencia(exper);
        return "La experiencia fue creada correctamente";
    }
    
    
    
    @DeleteMapping ("/delete/{id}")
    public String borrarExperiencia(@PathVariable int id){
        sExperiencia.borrarExperiencia(id);
        return "La experiencia fue eliminada correctamente";
    }
    

    @PutMapping("/update/{id}")
    public void editarExperiencia(@RequestBody Experiencia exp) {
        sExperiencia.editarExperiencia(exp);
    }
}
