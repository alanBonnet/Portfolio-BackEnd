/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.models;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author alan_
 */
@Entity
@Getter @Setter
@Table(name = "user_log")
public class UserModel implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique=true,nullable = false)
    private Long id;
    
    @NotNull
    @Size (min=1, max = 50, message = "no cumple con la longitud")
    private String username;
    @NotNull
    @Size (min=1, max = 50, message = "no cumple con la longitud")
    private String name;
    @NotNull
    @Size (min=1, max = 50, message = "no cumple con la longitud")
    private String password;
    @NotNull
    @Size (min=1, max = 50, message = "no cumple con la longitud")
    private String email;
    
    
   

    
    

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
}
