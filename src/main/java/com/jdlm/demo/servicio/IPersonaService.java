package com.jdlm.demo.servicio;

import java.util.List;

import com.jdlm.demo.domain.Persona;

public interface IPersonaService {
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
