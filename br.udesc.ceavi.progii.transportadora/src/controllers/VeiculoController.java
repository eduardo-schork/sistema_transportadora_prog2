/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.forms.FormVeiculo;

/**
 *
 * @author André Cristen
 */
public class VeiculoController extends BaseController {

    @Override
    public boolean openInsertionFrom() {
        FormVeiculo view = new FormVeiculo();
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.run();
        return true;
    }

    @Override
    public boolean openEditionForm(int id) {
       FormVeiculo view = new FormVeiculo();
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
        FormVeiculo view = new FormVeiculo();
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.run();
        return true;
    }

    @Override
    public boolean insertObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
