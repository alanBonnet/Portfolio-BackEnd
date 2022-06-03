/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.interfaces;

import APback.springAP.models.EducationModel;
import java.util.List;

/**
 *
 * @author alan_
 */
public interface EducationInterface {
    public List<EducationModel> getEducation();
    
    public void  addEducation(EducationModel education);
    
    public void delEducation(Long id);
    
    public EducationModel findEducation(Long id);
}
