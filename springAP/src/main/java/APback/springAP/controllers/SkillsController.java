/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.controllers;

import APback.springAP.models.SkillsModel;
import APback.springAP.services.SkillsService;
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
@RequestMapping("user/skill")
public class SkillsController {

    @Autowired
    SkillsService skillsService;

    @GetMapping("/all")
    public List<SkillsModel> getSkills() {
        return skillsService.getSkills();
    }

    @GetMapping("/{id}")
    public SkillsModel findSkill(@PathVariable Long id) {
        SkillsModel skill = skillsService.findSkill(id);
        return skill;
    }

    @PostMapping("/add")
    public SkillsModel addSkill(@RequestBody SkillsModel skill) {
        this.skillsService.addSkill(skill);
        return skill;
        /*return "Skill agregada exitosamente.";*/
    }

    @DeleteMapping("/del/{id}")
    public String delSkill(@PathVariable Long id) {
        skillsService.delSkill(id);
        return "Skill eliminada exitosamente";
    }

    @PutMapping("/edit/{id}")
    public SkillsModel editSkill(@PathVariable Long id,
            @RequestParam("nameSkill") String newNameSkill,
            @RequestParam("levelSkill") String newLevelSkill) {

        SkillsModel skill = skillsService.findSkill(id);
        skill.setNameSkill(newNameSkill);
        skill.setLevelSkill(newLevelSkill);

        skillsService.addSkill(skill);
        return skill;
    }
}