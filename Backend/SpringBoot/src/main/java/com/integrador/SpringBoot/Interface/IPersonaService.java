
package com.integrador.SpringBoot.Interface;

import com.integrador.SpringBoot.entity.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> getPersona();
    
    public void savePersona(Persona pers);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
    
    
}
