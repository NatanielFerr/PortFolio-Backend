
package com.portfolioferreyra.nataniel.controller;

import com.portfolioferreyra.nataniel.entity.Persona;
import com.portfolioferreyra.nataniel.service.SPersona;
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
@RequestMapping("personas")
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {
    @Autowired
    SPersona persoServ;
    
    @PostMapping ("autenticacion/login")
    public Persona loginPersona (@RequestBody Persona pers){
        return persoServ.loginPersona(pers.getEmail(), pers.getContrasenia());
    }
    
    @GetMapping ("ver/personas")
    @ResponseBody
    public List <Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @GetMapping("detail/{id}")
    @ResponseBody
    public Persona buscarPersona (@PathVariable Long id){
        return persoServ.buscarPersona(id);
    }
    
    @PostMapping ("new/persona")
    public String agregarPersona (@RequestBody Persona per){
        persoServ.crearPersona(per);
        return "La persona fue creada correctamente";
    }
    
    
    
    @DeleteMapping ("borrar/persona/{id}")
    public String eliminarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
        return "La persona fue eliminada correctamente";
    }
    
//    @PutMapping ("editar/persona/{id}")
//    public Persona editarPersona(@PathVariable Long id, 
//                                 @RequestParam("nombre") String nuevoNombre, 
//                                 @RequestParam("apellido") String nuevoApellido, 
//                                 @RequestParam("descargacv") String nuevaDescargacv,
//                                 @RequestParam("titulo") String nuevoTitulo,
//                                 @RequestParam("sobre_mi") String nuevoSobre_mi,
//                                 @RequestParam("banner") String nuevoBanner,
//                                 @RequestParam("imagen") String nuevaImagen){
//        Persona perso = persoServ.buscarPersona(id);
//        
//        perso.setApellido(nuevoApellido);
//        perso.setNombre(nuevoNombre);
//        perso.setDescargacv(nuevaDescargacv);
//        perso.setTitulo(nuevoTitulo);
//        perso.setSobre_mi(nuevoSobre_mi);
//        perso.setBanner(nuevoBanner);
//        perso.setImagen(nuevaImagen);
//        
//        persoServ.crearPersona(perso);
//        return perso;
//    }
    
    @PutMapping("editar/persona/{id}")
    public void editarPersona(@RequestBody Persona per) {
        persoServ.editarPersona(per);
    }
    
    @GetMapping ("traer/personas")
    @ResponseBody
    public Persona buscarPersona(){
        return persoServ.buscarPersona((long)1);
    }
    
}
