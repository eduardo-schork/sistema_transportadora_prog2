/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author André Cristen
 */
public abstract class BaseController {

    /**
     * Metodo utilizado para abrir o form de insercao do objeto
     */
    public abstract boolean add();
    
    /**
     * Metodo utilizado para publicar um objeto, utilizado na acao gravar do form 
     */
    public abstract boolean addPost();

    /**
     * Metodo utilizado para abrir o from de edicao do objeto 
     */
    public abstract boolean edit();
    
    /**
     * Metodo utilizado para publicar o objeto, utilizado na acao salvar do form
     */
    public abstract boolean editPost();

    /**
     * Metodo que inicia a exclusao do objeto
     */
    public abstract boolean delete();

    /**
     * Metodo utilizado para abrir o form de visualizacao do objeto
     */
    public abstract boolean view();
}
