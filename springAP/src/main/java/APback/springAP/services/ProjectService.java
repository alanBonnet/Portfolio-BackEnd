/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.services;

import APback.springAP.interfaces.ProjectInterface;
import APback.springAP.models.ProjectModel;
import APback.springAP.repositories.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alan_
 */
@Service
public class ProjectService implements ProjectInterface {
    
    @Autowired ProjectRepository projectRepository;
    
    @Override
    public List<ProjectModel> getProject() {
        List<ProjectModel> projects = projectRepository.findAll();
        return projects;
    }

    @Override
    public ProjectModel findProject(Long id) {
        ProjectModel project = projectRepository.findById(id).orElse(null);
        return project;
    }

    @Override
    public void delProject(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public void addProject(ProjectModel project) {
        projectRepository.save(project);
    }
    
}
