/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author alan_
 */
@Getter @Setter
@Entity
@Table(name = "perfil")
public class PerfilModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique=true,nullable = false)
    private Long id;
    
    @NotNull
    @Size (min=1, max = 50, message = "no cumple con la longitud")
    private String firstname;
    
    @NotNull
    @Size (min=1, max = 50, message = "no cumple con la longitud")
    private String lastname;
      @Size(min=10, max = 350, message = "no cumple con la longitud")
    private String aboutMe;
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String profession;
    private String imgPhoto;
    private String imgBanner;
    private String facebook;
    private String instagram;
    private String twitter;
    private String urlWeb;
    private String linkedin;
    
    @ManyToOne
    @JoinColumn(name="id_user",referencedColumnName = "id")
    private UserModel idUser;
 
    
    
}
