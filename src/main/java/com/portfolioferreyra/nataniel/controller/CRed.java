
package com.portfolioferreyra.nataniel.controller;

import com.portfolioferreyra.nataniel.entity.Red;
import com.portfolioferreyra.nataniel.service.SRed;
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
@RequestMapping("redes")
@CrossOrigin(origins = "https://portfolionatanielferreyra1.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class CRed {
    @Autowired
    SRed sRed;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Red> verRedes(){
        return sRed.verRedes();
    }
    
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public Red buscarRed (@PathVariable int id){
        return sRed.buscarRed(id);
    }
    
    @PostMapping ("/create")
    public String crearRed (@RequestBody Red rede){
        sRed.crearRed(rede);
        return "La habilidad fue creada correctamente";
    }
    
    
    
    @DeleteMapping ("/delete/{id}")
    public String borrarHabilidad(@PathVariable int id){
        sRed.borrarRed(id);
        return "La habilidad fue eliminada correctamente";
    }
    
    @PutMapping("/update/{id}")
    public void editarRed(@RequestBody Red redes) {
        sRed.editarRed(redes);
    }
}
