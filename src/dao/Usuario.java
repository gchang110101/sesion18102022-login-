/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelos.MUsuario;

/**
 *
 * @author labc205
 */
public class Usuario {
    private ArrayList<MUsuario> lista = new ArrayList<>();

    public ArrayList<MUsuario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<MUsuario> lista) {
        this.lista = lista;
    }

    public Usuario() {
    }
    
    public void agregar(String user, String pw, String nombres, String apellidos,
            String email) {
        this.lista.add(new MUsuario(user, pw, nombres, apellidos, email));
    }
    
    public boolean autentcarUsuario(String user, String pw) {
        for(MUsuario us: this.lista) {
            if(us.verificarUsuario(user, pw))
                return true;
        }
        
        return false;
    }
    
    public boolean eliminarUsuario(String userName) {
        
        for (MUsuario usuario: this.lista) {
            
            if(usuario.existe(userName)) {
                
                this.lista.remove(usuario);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<MUsuario> buscarXNombre(String valor) {
        ArrayList<MUsuario> resultado = new ArrayList<>();
        
        for(MUsuario usuario: this.lista) {
            
            String userN = usuario.getNombres().toUpperCase() +
                    " " + usuario.getApellidos().toUpperCase();
            
            if(userN.startsWith(valor.toUpperCase()))
                resultado.add(usuario);
        }
        return resultado;
    }
    
    public void editar(String user, String pw, String nombres, String apellidos,
            String email) {
        for(modelos.MUsuario usuario: this.lista) {
            if(usuario.existe(user)) {
                usuario.setPw(pw);
                usuario.setNombres(nombres);
                usuario.setApellidos(apellidos);
                usuario.setEmail(email);
            }
        }
    }
}
