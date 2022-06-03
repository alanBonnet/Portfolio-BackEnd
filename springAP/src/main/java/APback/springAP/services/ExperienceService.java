/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.services;

import APback.springAP.models.ExperienceModel;
import APback.springAP.repositories.ExperienceRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alan_
 */
@Service
public class ExperienceService {
    @Autowired
    ExperienceRepository experienceRepository;
    
    public ArrayList<ExperienceModel> getExperience(){
        return (ArrayList<ExperienceModel>) experienceRepository.findAll();
    }
    
    public void addExperience(ExperienceModel position){
         experienceRepository.save(position);
    }
    
    public ExperienceModel findExperience(Long id){
        ExperienceModel experience = experienceRepository.findById(id).orElse(null);
        return experience;
    }
   
    public void delExperience(Long id){
        experienceRepository.deleteById(id);
    }
    
}

    
    
 