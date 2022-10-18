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
    
    public boolean verificarUser(String user, String pw) {
        return this.username.equals(user) && this.pw.equals(pw);
    }
    
    public boolean autentcarUsuario(String user, String pw) {
        for(MUsuario us: this.lista) {
            if(us.verificarUser(user,  pw))
                return true;
        }
        
        return false;
    }
}
