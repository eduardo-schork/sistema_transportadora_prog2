/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.forms.FormEntrega;

/**
 *
 * @author André Cristen
 */
public class EntregaController extends BaseController {

    @Override
    public boolean openInsertionFrom() {
        FormEntrega view = new FormEntrega();
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
    public boolean openEditionForm(int id) {
        FormEntrega view = new FormEntrega();
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.run();
        return true;
    }

    @Override
    public boolean editObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean view(int id) {
        FormEntrega view = new FormEntrega();
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.run();
        return true;
    }

}
