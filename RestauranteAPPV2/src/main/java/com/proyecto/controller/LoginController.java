/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.controller;

import com.sun.xml.internal.ws.client.RequestContext;
import javax.annotation.PostConstruct;
import javax.inject.Named;


/**
 *
 * @author homeroPC
 */
@Named
public class LoginController {

    private String usuario;
    private String pass;

    @PostConstruct
    public void init() {

    }

    public void iniciarSesion() {
        System.out.print("Bienvenido al sistema");

    }

    //Getter and Setter
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
