/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.forms.FormUsuario;

/**
 *
 * @author Lucas Levi Gonçalves
 */
public class UsuarioController extends BaseController {

    @Override
    public boolean add() {
        FormUsuario view = new FormUsuario();
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.run();
        return true;
    }

    @Override
    public boolean edit(int id) {
        FormUsuario view = new FormUsuario();
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.run();
        return true;
    }

    @Override
    public boolean delete(int id) {
        System.out.println("DELETE");
        return true;
    }

    @Override
    public boolean view(int id) {
        FormUsuario view = new FormUsuario();
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.run();
        return true;
    }

    @Override
    public boolean addPost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editPost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
