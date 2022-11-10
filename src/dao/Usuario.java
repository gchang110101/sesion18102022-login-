/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.MUsuario;

/**
 *
 * @author labc205
 */
public class Usuario extends Conexion {
    private ResultSet rs;
    private PreparedStatement st = null;
    private Connection conn = this.obtenerConexion();
    
    private ArrayList<MUsuario> lista = new ArrayList<>();

    public ArrayList<MUsuario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<MUsuario> lista) {
        this.lista = lista;
    }

    public Usuario() {
        this.obtenerRegistros();
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
    
    public ArrayList buscarXNombre(String valor) {
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
    
    public void obtenerRegistros() {
        String tSQL = "Select * from Usuario";
        
        try{
            st = conn.prepareStatement(tSQL);
            rs = st.executeQuery();
            
            //rs = st.executeQuery(tSQL);
            
            while(rs.next()) {
                this.agregar(rs.getString("userName"), 
                    rs.getString("pw"), 
                    rs.getString("nombres"), 
                    rs.getString("apellidos"), 
                    rs.getString("email"));
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public boolean guardarRegistro(MUsuario u) {
        boolean ok = false;
        
        try {
            String tSQL = "Insert into Usuario (" 
                    + "userName, Pw, Nombres, Apellidos, Email" 
                    + "values(?, ?, ?, ?, ?)";
            
            st = conn.prepareStatement(tSQL);
            st.setString(1, u.getUserName());
            st.setString(2, u.getPw());
            st.setString(3, u.getNombres());
            st.setString(4, u.getApellidos());
            st.setString(5, u.getEmail());
            
            
        } catch (Exception ex) {
            
        }
        
        return ok;
    }
}
