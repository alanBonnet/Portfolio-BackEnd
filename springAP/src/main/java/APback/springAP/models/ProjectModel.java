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
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author alan_
 */
@Entity
@Getter
@Setter
@Table(name = "projects")
public class ProjectModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    
    @Size(min=10, max = 35, message = "no cumple con la longitud")
    private String nameP;
    @Size(min=10, max = 350, message = "no cumple con la longitud")
    private String descriptionP;
    private String repositoryLink;
    private String demoLink;
    
    
    @ManyToOne
    @JoinColumn(name="id_user")
    private UserModel idUser;


    
    
}
