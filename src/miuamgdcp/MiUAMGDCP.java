/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miuamgdcp;

import dao.Usuario;
import formularios.Login;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Chang
 */
public class MiUAMGDCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Usuario usuarios = new Usuario();
       
       usuarios.agregar("19014795", "123", "Gabriel David", "Chang Perez", 
               "gdchang@uamv.edu.ni");
       
       Login login = new Login();
       login.usuarios = usuarios;
       login.setVisible(true);
    }
    
}
