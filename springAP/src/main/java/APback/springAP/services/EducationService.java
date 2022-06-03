/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.services;

import APback.springAP.interfaces.EducationInterface;
import APback.springAP.models.EducationModel;
import APback.springAP.repositories.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alan_
 */
@Service
@Transactional
public class EducationService implements EducationInterface {
    @Autowired EducationRepository educationRepository;
    
    @Override
    public List<EducationModel> getEducation() {
        List<EducationModel> education = educationRepository.findAll();
        return education;
    }

    @Override
    public void addEducation(EducationModel education) {
        educationRepository.save(education);
    }

    @Override
    public void delEducation(Long id) {
        educationRepository.deleteById(id);
    }
    
    @Override
    public EducationModel findEducation(Long id) {
        EducationModel educatione = educationRepository.findById(id).orElse(null);
        return educatione;
    }
    
}
