/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author André Cristen
 * 
 * basicamente é a classe que serve de base para outros controllers, entidade que 
 * lida com interações do da tela com o banco de dados, além de processamentos na info que vem e vai etc
 */
public abstract class BaseController {

    /**
     * Metodo utilizado para abrir o form de insercao do objeto
     */
    public abstract boolean openInsertionFrom();
    
    /**
     * Metodo utilizado para publicar um objeto, utilizado na acao gravar do form 
     * 
     * eu tentei renomear pra alguma coisa que faz sentido mas o addPost e add  
     * são nomes tão ruins e sem sentido que não sei exatamente oque esse método faz
     */
    public abstract boolean insertObject();

    /**
     * Metodo utilizado para abrir o from de edicao do objeto 
     */
    public abstract boolean openEditionForm(int identificador);
    
    /**
     * Metodo utilizado para publicar o objeto, utilizado na acao salvar do form
     */
    public abstract boolean editObject();

    /**
     * Metodo que inicia a exclusao do objeto
     */
    public abstract boolean delete(int identificador);

    /**
     * Metodo utilizado para abrir o form de visualizacao do objeto
     */
    public abstract boolean view(int identificador);
}
