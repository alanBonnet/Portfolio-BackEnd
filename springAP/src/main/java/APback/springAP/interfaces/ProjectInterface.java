/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.interfaces;

import APback.springAP.models.ProjectModel;
import java.util.List;

/**
 *
 * @author alan_
 */
public interface ProjectInterface  {
           
    public List<ProjectModel> getProject();
    
    public ProjectModel findProject(Long id);
    
    public void delProject(Long id);
    
    public void addProject(ProjectModel project);
}
