/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.controllers;

import APback.springAP.models.ExperienceModel;
import APback.springAP.services.ExperienceService;
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
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alan_
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user/experience")

public class ExperienceController {
    @Autowired
    ExperienceService experienceService; 
    @GetMapping("/all")
    public List<ExperienceModel> getExperiences(){
         System.out.print(experienceService.getExperience().get(1));
        return experienceService.getExperience();
    }
    
    @GetMapping("/{id}")
    public ExperienceModel findExperience(@PathVariable Long id){
        ExperienceModel experience = experienceService.findExperience(id);
        return experience; 
     }
    
    @PostMapping("/add")
    public String addExperience(@RequestBody ExperienceModel experience){
        this.experienceService.addExperience(experience);
        return "Experiencia agregada exitosamente.";
    }
    
    @DeleteMapping("del/{id}")
    public String delExperience(@PathVariable Long id){
        experienceService.delExperience(id);
        return "Experiencia eliminada exitosamente.";
    }
    
    @PutMapping("edit/{id}")
    public ExperienceModel editExperience(@PathVariable Long id,
                                                                   @RequestParam("position")String newPosition,
                                                                   @RequestParam("description")String newDescription,
                                                                   @RequestParam("dateStart")String newDateStart,
                                                                   @RequestParam("dateEnd")String newDateEnd){
         
        ExperienceModel experience = experienceService.findExperience(id);
        experience.setPosition(newPosition);
        experience.setDescription(newDescription);
        experience.setDateStart(newDateStart);
        experience.setDateEnd(newDateEnd);
        
        experienceService.addExperience(experience);
        
        return experience;
    }
    
}
