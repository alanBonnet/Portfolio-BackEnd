/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.interfaces;

import APback.springAP.models.UserModel;
import java.util.List;

/**
 *
 * @author alan_
 */
public interface userInterface {
    public List<UserModel> getUsers();
    
    public void addUser(UserModel username);
    
    public void deleteUser(Long id);
    
    public UserModel findUser(Long id);
    
    
}
