/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APback.springAP.interfaces;

import APback.springAP.models.PerfilModel;
import java.util.List;

/**
 *
 * @author alan_
 */
public interface PerfilInterface {
    public List<PerfilModel> getPerfil();
    
    public void addPerfil(PerfilModel perfil);
    
    public void delPerfil(Long id);
    
    public PerfilModel findPerfil(Long id);
}
