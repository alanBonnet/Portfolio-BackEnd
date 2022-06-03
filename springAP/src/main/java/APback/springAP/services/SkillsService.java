/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.services;

import APback.springAP.interfaces.SkillsInterface;
import APback.springAP.models.SkillsModel;
import APback.springAP.repositories.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alan_
 */
@Service
public class SkillsService implements SkillsInterface {
    
    @Autowired SkillsRepository skillsRepository;
    
    @Override
    public List<SkillsModel> getSkills() {
        List<SkillsModel> skills = skillsRepository.findAll();
        return skills;
    }
    
    @Override
    public SkillsModel findSkill(Long id) {
        SkillsModel skill = skillsRepository.findById(id).orElse(null);
        return skill;
    }
    
    @Override
    public void addSkill(SkillsModel skill) {
        this.skillsRepository.save(skill);
    }

    @Override
    public void delSkill(Long id) {
        this.skillsRepository.deleteById(id);
    }

    
    
}
