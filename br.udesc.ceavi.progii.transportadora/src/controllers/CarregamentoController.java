/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.forms.FormCarregamento;

/**
 *
 * @author Lucas Dolsan
 */
public class CarregamentoController extends BaseController{

    @Override
    public boolean add() {
        FormCarregamento view = new FormCarregamento();
        view.run();
        return true;
    }

    @Override
    public boolean edit(int id) {
        FormCarregamento view = new FormCarregamento();
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
       System.out.println("VIEW");
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
