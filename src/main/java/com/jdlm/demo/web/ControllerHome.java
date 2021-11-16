package com.jdlm.demo.web;

import com.jdlm.demo.dao.IPersonaDao;
import com.jdlm.demo.domain.Persona;
import com.jdlm.demo.servicio.IPersonaService;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;

@Controller
@Slf4j
public class ControllerHome {
    
    @Autowired
    private IPersonaService personaService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var personas = personaService.listarPersonas();
        
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/agregar")
    public  String agregar(Persona persona){
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona){
        personaService.guardar(persona);
        return "redirect:/";
    }

//    @GetMapping("/")
//    public String inicio(Model model){
//        var mensaje = "Hola mundo con Thymeleaf";
//        
//        var persona = new Persona();
//        persona.setNombre("Jorney");
//        persona.setApellido("Lopez");
//        persona.setEmail("jorney95@live.com");
//        persona.setTelefono("8888 8888");
//        
//        var persona2 = new Persona();
//        persona2.setNombre("Daniel");
//        persona2.setApellido("Lopez");
//        persona2.setEmail("jorney95@live.com");
//        persona2.setTelefono("8888 8888");
//        
//        var personas = new ArrayList();
//        personas.add(persona);
//        personas.add(persona2);
//
//        var personas = Arrays.asList(persona, persona2);
//        
//        
//        log.info("Ejecutando el controlador Spring MVC");
//        model.addAttribute("mensaje", mensaje);
//        model.addAttribute("personas", personas);
//        return "index";
//    }
}
