/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.services;

import APback.springAP.interfaces.userInterface;
import APback.springAP.models.UserModel;
import APback.springAP.repositories.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alan_
 */
@Service
public class UserService implements userInterface {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserModel> getUsers() {
        List<UserModel> readUser = userRepository.findAll();
        return readUser;
    }
   
    @Override
    public void addUser(UserModel username) {
        userRepository.save(username);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserModel findUser( Long id) {
        UserModel User = userRepository.findById(id).orElse(null);
        return User;
    }

   
    
    
}
