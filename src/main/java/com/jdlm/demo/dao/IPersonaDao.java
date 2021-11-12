
package com.jdlm.demo.dao;

import com.jdlm.demo.domain.Persona;

import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
}
