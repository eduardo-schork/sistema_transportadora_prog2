/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import models.Endereco;
import views.frames.EnderecoFrame;
import views.grids.EnderecoGrid;

/**
 *
 * @author 09046167976
 */
public class Home implements Runnable{
    public static void main(String[] args) {
        Home tela = new Home();
        Thread thread = new Thread(tela);
        
        thread.start();
    }

    @Override
    public void run() {
        //Vai ser buscado do bd
       List<Endereco> enderecos = new ArrayList<>();
       
        //Cira objetos para serem exibidos no JTable
        for (int i = 1; i <= 15; i++) {
            Endereco socio = new Endereco();
            socio.setId(i);
            socio.setBairro("Bairro" + i);
            socio.setCep(10*3+i);
            socio.setCidade(("Cidade"+i * 10));
            enderecos.add(socio);
        }
  
        String[] colunas;
        colunas = new String[]{"#", "Bairro", "Cep", "Cidade"};
        EnderecoGrid enderecoGrid = new EnderecoGrid((List)enderecos, colunas);
        JFrame frame = new EnderecoFrame((List)enderecos, "Endereços", enderecoGrid );
        frame.setVisible(true);
    }
}
