/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import br.udesc.ceavi.progii.transudesc.view.menus.Menu;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import models.Endereco;
import models.Veiculo;
import views.frames.InstanceGridFrame;
import views.grids.EnderecoGrid;
import views.grids.VeiculoGrid;

/**
 *
 * @author 09046167976
 */
public class Home implements Runnable {

    public static void main(String[] args) {
        Home tela = new Home();
        Thread thread = new Thread(tela);

        thread.start();
    }

    @Override
    public void run() {
        Menu menu = new Menu();
        //Vai ser buscado do db
        List<Endereco> enderecos = new ArrayList<>();

        //Cira objetos para serem exibidos no JTable
        for (int i = 1; i <= 15; i++) {
            Endereco end = new Endereco();
            end.setId(i);
            end.setBairro("Bairro" + i);
            end.setCep(10 * 3 + i);
            end.setCidade(("Cidade" + i * 10));
            enderecos.add(end);
        }

        String[] colunas;
        colunas = new String[]{"#", "Bairro", "Cep", "Cidade"};
        EnderecoGrid enderecoGrid = new EnderecoGrid((List)enderecos, colunas);
        JFrame frame = new InstanceGridFrame((List)enderecos, "Endereços", enderecoGrid );
        
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
        List<Veiculo> veiculos = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            Veiculo veiculo = new Veiculo();
            veiculo.setId(i);
            veiculo.setPlaca("PLACA-" + i);
            veiculo.setStatus(10*3+i);
            veiculo.setTipo(i * 10);
            veiculos.add(veiculo);
        }
        String[] colunasVeiculos;
        colunasVeiculos = new String[]{"#", "Aquisição", "Placa", "Status", "Tipo"};
        VeiculoGrid veiculoGrid = new VeiculoGrid((List)veiculos, colunasVeiculos);
        JFrame frameVeiculo = new InstanceGridFrame((List)veiculos, "Veiculos", veiculoGrid );
        
        frameVeiculo.setResizable(false);
        frameVeiculo.setLocationRelativeTo(null);
        frameVeiculo.setVisible(true);
        menu.setVisible(true);
    }
}
