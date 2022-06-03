/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.interfaces;

import APback.springAP.models.SkillsModel;
import java.util.List;

/**
 *
 * @author alan_
 */
public interface SkillsInterface {
    public List<SkillsModel> getSkills();
    
    public SkillsModel findSkill(Long id);
    
    public void addSkill(SkillsModel skill);
    
    public void delSkill(Long id);
    
    
}
