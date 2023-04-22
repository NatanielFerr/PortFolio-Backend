
package com.portfolioferreyra.nataniel.controller;

import com.portfolioferreyra.nataniel.entity.Cv;
import com.portfolioferreyra.nataniel.service.SCv;
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
@RequestMapping("curriculums")
@CrossOrigin(origins = "https://portfolionatanielferreyra1.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class CCv {
    @Autowired
    SCv sCv;
    
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Cv> verCvs(){
        return sCv.verCvs();
    }
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public Cv buscarCv (@PathVariable int id){
        return sCv.buscarCv(id);
    }
    
    @PostMapping ("/create")
    public String crearCv (@RequestBody Cv cvs){
        sCv.crearCv(cvs);
        return "El Cv fue creado correctamente";
    }
    
    
    
    @DeleteMapping ("/delete/{id}")
    public String borrarCv(@PathVariable int id){
        sCv.borrarCv(id);
        return "La educacion fue eliminada correctamente";
    }

    
    
     @PutMapping("/update/{id}")
    public void editarCv(@RequestBody Cv cvs) {
        sCv.editarCv(cvs);
    }
    
}
