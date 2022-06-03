/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.controllers;

import APback.springAP.models.ProjectModel;
import APback.springAP.services.ProjectService;
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
@RequestMapping("/user/project")
public class ProjectController {
    @Autowired ProjectService projectService;
    
    @GetMapping("/all")
    public List<ProjectModel> getProject(){
        return projectService.getProject();
    }
    @GetMapping("/{id}")
    public ProjectModel findProject(@PathVariable Long id){
        return this.projectService.findProject(id);
    }
    
    @PostMapping("/add")
    public String addProject(@RequestBody ProjectModel project){
         this.projectService.addProject(project);
        return "Proyecto agregado exitosamente.";
    }
    
    @DeleteMapping("/del/{id}")
    public String delProject(@PathVariable Long id){
        projectService.delProject(id);
        return "Proyecto eliminado exitosamente.";
    }
    
    @PutMapping("/edit/{id}")
    public ProjectModel editProject(@PathVariable Long id,
            @RequestParam("nameP") String newNameP,
            @RequestParam("descriptionP") String newDescriptionP,
            @RequestParam("repositoryLink") String newRepositoryLink,
            @RequestParam("demoLink") String newDemoLink) {
        ProjectModel project = projectService.findProject(id);
        project.setNameP(newNameP);
        project.setDescriptionP(newDescriptionP);
        project.setRepositoryLink(newRepositoryLink);
        project.setDemoLink(newDemoLink);
        
        projectService.addProject(project);
        return project;
    }
}
