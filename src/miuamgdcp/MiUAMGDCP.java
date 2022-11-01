/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miuamgdcp;

import dao.Usuario;
import formularios.Login;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import modelos.MUsuario;

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
       
        usuarios.agregar("66666666", "testingXD", "empty empty", "empty empty", 
               "emptyempty@uamv.edu.ni");
       
        usuarios.agregar("1", "1", "testUser", "testLast", "testEmail");
        
        usuarios.agregar("300", "69", "Juan Manuel", "Lopez Garcia", "jmlopez@uamv.edu.ni");
        
        /* ArrayList<MUsuario> newLista = new ArrayList<>();
        newLista = usuarios.buscarXNombre("s");

        for(Object u: newLista) {
            System.out.println(u);
        } */
       
        Login login = new Login();
        login.usuarios = usuarios;
        login.setVisible(true);
    }
    
    public void llenarUsuarios() {
        Usuario usuarios = new Usuario();
       
       usuarios.agregar("19014795", "123", "Gabriel David", "Chang Perez", 
               "gdchang@uamv.edu.ni");
       
       usuarios.agregar("66666666", "testingXD", "empty empty", "empty empty", 
               "emptyempty@uamv.edu.ni");
       
       Login login = new Login();
       login.usuarios = usuarios;
       login.setVisible(true);
    }
}
