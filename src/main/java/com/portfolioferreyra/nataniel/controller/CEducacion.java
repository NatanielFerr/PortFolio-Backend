
package com.portfolioferreyra.nataniel.controller;

import com.portfolioferreyra.nataniel.entity.Educacion;
import com.portfolioferreyra.nataniel.service.SEducacion;
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
@RequestMapping("educaciones")
@CrossOrigin(origins = "http://localhost:4200")
public class CEducacion {
    @Autowired
    SEducacion sEducacion;
    
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Educacion> verEducaciones(){
        return sEducacion.verEducaciones();
    }
    
    @GetMapping("/detail/{id}")
    @ResponseBody
    public Educacion verEducacionesid (@PathVariable int id){
        return sEducacion.buscarEducacion(id);
    }
    
    @PostMapping ("/create")
    public String crearEducacion (@RequestBody Educacion educac){
        sEducacion.crearEducacion(educac);
        return "La educacion fue creada correctamente";
    }
    
    
    
    @DeleteMapping ("/delete/{id}")
    public String borrarEducacion(@PathVariable int id){
        sEducacion.borrarEducacion(id);
        return "La educacion fue eliminada correctamente";
    }
    
    @PutMapping ("/update/{id}")
    public Educacion editarEducacion(@PathVariable int id, 
                                 @RequestParam("nivel") String nuevoNivel, 
                                 @RequestParam("institucion") String nuevaInstitucion, 
                                 @RequestParam("img") String nuevaImg,
                                 @RequestParam("descripcion") String nuevaDescripcion,
                                 @RequestParam("link") String nuevoLink,
                                 @RequestParam("inicio") Date nuevoInicio,
                                 @RequestParam("fin") Date nuevoFin){
        Educacion edus = sEducacion.buscarEducacion(id);
        
        edus.setInstitucion(nuevaInstitucion);
        edus.setNivel(nuevoNivel);
        edus.setImg(nuevaImg);
        edus.setDescripcion(nuevaDescripcion);
        edus.setLink(nuevoLink);
        
        
        sEducacion.crearEducacion(edus);
        return edus;
    }
    
}
