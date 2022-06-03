/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.controllers;

import APback.springAP.models.PerfilModel;
import APback.springAP.services.PerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("user/perfil")
public class PerfilController {
    @Autowired PerfilService perfilService;
    
    @GetMapping("/all")
    public List<PerfilModel> getPerfil(){
        return perfilService.getPerfil();
    }
    
    @GetMapping("/{id}")
    public PerfilModel findPerfil(@PathVariable Long id){
        return perfilService.findPerfil(id);
    }
    
    @GetMapping("/get")
    public PerfilModel getUser1(){
        return perfilService.findPerfil((long)3);
    }
    
    @PostMapping("/add")
    public String addPerfil(@RequestBody PerfilModel perfil){
         this.perfilService.addPerfil(perfil);
        return "El perfil fue creado correctamente.";
    }
    
    
    @DeleteMapping("/del/{id}")
    public String delPerfil(@PathVariable Long id){
        perfilService.delPerfil(id);
        return "Perfil eliminado correctamente";
    }
    /*
    lastname
aboutMe
profession
imgPhoto
imgBanner
 facebook
instagram
twitter
urlWeb
 linkedin
    
    
    */
    /*@RequestParam("aboutMe") String newAboutme,
                                                    @RequestParam("imgPhoto") String newImgPhoto,
                                                    @RequestParam("imgBanner") String newImgBanner,
                                                    @RequestParam("facebook") String newFb,
                                                    @RequestParam("instagram") String newIg,
                                                    @RequestParam("twitter") String newTw,
                                                    @RequestParam("urlWeb") String newUrlWeb,
                                                    @RequestParam("linkedin") String newLinkedin*/
    @PutMapping("/edit/{id}")
    public PerfilModel editPerfil(@PathVariable Long id,
                                                    @RequestParam("firstname") String newFname,
                                                    @RequestParam("profession") String newProfession,
                                                    @RequestParam("lastname") String newLname
                                                    ){
        PerfilModel perfil = perfilService.findPerfil(id);
        
        perfil.setFirstname(newFname);
        perfil.setLastname(newLname);
        perfil.setProfession(newProfession);
        /* perfil.setAboutMe(newAboutme);
        perfil.setImgPhoto(newImgPhoto);
        perfil.setImgBanner(newImgBanner);
        perfil.setFacebook(newFb);
        perfil.setTwitter(newTw);
        perfil.setUrlWeb(newUrlWeb);
        perfil.setLinkedin(newLinkedin);*/
        
        
        perfilService.addPerfil(perfil);
        return perfil;
    }
    
}
