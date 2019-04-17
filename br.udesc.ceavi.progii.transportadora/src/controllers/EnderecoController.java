/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Endereco;
import views.forms.FormEndereco;

/**
 *
 * @author André Cristen
 */
public class EnderecoController extends BaseController {

    public List<Endereco> getAllEnderecos() {
        return new ArrayList<Endereco>();
    }

    @Override
    public boolean add() {
        FormEndereco view = new FormEndereco();
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.run();
        return true;
    }

    @Override
    public boolean edit(int id) {
        FormEndereco view = new FormEndereco();
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
        FormEndereco view = new FormEndereco();
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
