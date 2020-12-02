/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unal.RedFlix.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements java.io.Serializable{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 6485105191418783803L;
    
    @Id
    @Column(name="alias", length = 45)
    String alias;
    
    @Column(name="nombres", length = 45)
    String nombres;
    
    @Column(name="apellidos", length = 45)
    String apellidos;
    
    @Column(name="celular", length = 45)
    String celular;
    
    @Column(name="contraseña", length = 45)
    String contraseña;
    
    @Column(name="email", length = 45)
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "alias=" + alias + ", nombre=" + nombres + ", apellidos=" + apellidos + ", celular=" + celular + '}';
    }
}
