/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Endereco;
import views.forms.FormTransRedespacho;

/**
 *
 * @author Lucas Dolsan
 */
public class TransportadoraRedespachoController extends BaseController {

    public List<Endereco> getAllEnderecos() {
        return new ArrayList<Endereco>();
    }

    @Override
    public boolean openInsertionFrom() {
        FormTransRedespacho view = new FormTransRedespacho();
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.run();
        return true;
    }

    @Override
    public boolean openEditionForm(int id) {
        FormTransRedespacho view = new FormTransRedespacho();
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.run();
        return true;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean view(int id) {
        FormTransRedespacho view = new FormTransRedespacho();
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
