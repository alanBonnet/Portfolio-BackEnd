/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.controllers;

import APback.springAP.models.EducationModel;
import APback.springAP.services.EducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("user/education")
public class EducationController {
    @Autowired EducationService educationService;
    
    @GetMapping("/all")
    public List<EducationModel> getEducation(){
        List<EducationModel> educations = educationService.getEducation();
        return educations;
    }
    
    @GetMapping("/{id}")
    public EducationModel findEducation(@PathVariable Long id){
        return educationService.findEducation(id);
    }
    
    @PostMapping("/add")
    public String addEducation(@RequestBody EducationModel education){
        educationService.addEducation(education);
        return "Educación agregada exitosamente";
    }
    
    @DeleteMapping("del/{id}")
    public String delEducation(@PathVariable Long id){
        educationService.delEducation(id);
        return "Educación eliminada exitosamente";
    }
    
    @PutMapping("edit/{id}")
    public EducationModel editEducation(@PathVariable Long id,
                                                                @RequestParam("schoolName") String newSchoolName, 
                                                                @RequestParam("description") String newDescription,
                                                                @RequestParam("dateStart") String newDateStart,
                                                                @RequestParam("dateEnd") String newDateEnd){
        EducationModel education = educationService.findEducation(id);
        education.setSchoolName(newSchoolName);
        education.setDescription(newDescription);
        education.setDateStart(newDateStart);
        education.setDateEnd(newDateEnd);
        
        educationService.addEducation(education);
        return education;
    }
    
}
