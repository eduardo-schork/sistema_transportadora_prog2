/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import connections.DAO;
import connections.JPADAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import models.Carregamento;
import models.Endereco;
import models.Pessoa;
import models.Usuario;
import models.Veiculo;
import views.frames.InstanceGridFrame;
import views.grids.EnderecoGrid;
import views.grids.VeiculoGrid;

/**
 *@author 09046167976
 * 
 * início do sistema, instancia o menu e seta como visivel
 */
public class Home implements Runnable {

   public static void main(String[] args) throws Exception {
       Home tela = new Home();
       Pessoa pessoa = new Pessoa();
       pessoa.setNome("Alou");
       pessoa.setSobrenome("Cristen");
       JPADAO dao = new JPADAO();
       dao.persist(pessoa);
       Thread thread = new Thread(tela);
       thread.start();
    }

    @Override
    public void run() {
        Menu menu = new Menu();
        menu.setVisible(true);
    }
}
