/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.controllers;

import APback.springAP.models.UserModel;
import APback.springAP.services.UserService;
import java.util.ArrayList;
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
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService; 
    
   
    @GetMapping("/all")
    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userService.getUsers();
    }
    @GetMapping("/{id}")
    public UserModel getUser(@PathVariable Long  id){
        UserModel user = userService.findUser(id);
        return user;
    }
    /*@GetMapping("/get")
    public UserModel getUser1(){
        return userService.findUser((long)2);
    }*/
    @PostMapping("/add")
    public String  addUser(@RequestBody UserModel username){
        this.userService.addUser(username);
        return "El usuario fue creado correctamente.";
    }
    @DeleteMapping("/del/{id}")
    public String deleteUser(@PathVariable Long id){
        this.userService.deleteUser(id);
        return "El usuario fue eliminado correctamente.";
    }
    @PutMapping("edit/{id}")
    public UserModel editUser(@PathVariable Long id,
                                                @RequestParam("username") String newUsername,
                                                @RequestParam("name") String newName,
                                                @RequestParam("password") String newPassword,
                                                @RequestParam("email") String newEmail){
        UserModel user = userService.findUser(id);
        user.setName(newName);
        user.setUsername(newUsername);
        user.setPassword(newPassword);
        user.setEmail(newEmail);
        
        this.userService.addUser(user);
        return user;
    }
       
}
