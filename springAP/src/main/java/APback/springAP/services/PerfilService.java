/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.services;

import APback.springAP.interfaces.PerfilInterface;
import APback.springAP.models.PerfilModel;
import APback.springAP.repositories.PerfilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alan_
 */
@Service
public class PerfilService implements PerfilInterface {
    @Autowired PerfilRepository perfilRepository;
    
    
    @Override
    public List<PerfilModel> getPerfil() {
        List<PerfilModel> persona = perfilRepository.findAll();
        return persona;
    }

    @Override
    public void addPerfil(PerfilModel perfil) {
        perfilRepository.save(perfil);
    }

    @Override
    public void delPerfil(Long id) {
        perfilRepository.deleteById(id);
    }

    @Override
    public PerfilModel findPerfil(Long id) {
        PerfilModel perfil = perfilRepository.findById(id).orElse(null);
        return perfil;
    }
    
}
