package br.udesc.ceavi.progii.transudesc.view.menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class Menu extends JFrame {

    public Menu() {

        setTitle("TransUdesc");
        setSize(1920, 1080);

        // Cria uma barra de menu para o JFrame
        JMenuBar menuBar = new JMenuBar();

//         Adiciona a barra de menu ao  frame
        setJMenuBar(menuBar);

        JMenu crud_menu = new JMenu("CRUD");
        JMenu relatorios_menu = new JMenu("Relatórios");
        JMenu consulta_adm_menu = new JMenu("Consultas - Administrador");
        JMenu verif_veiculos_menu = new JMenu("Verificar veículos");
        JMenu cargas_menu = new JMenu("Cargas");
        JMenu consulta_entrega = new JMenu("Consultar Entregas");

//      Coloca na barra de menu
        menuBar.add(crud_menu);
        menuBar.add(consulta_adm_menu);
        menuBar.add(verif_veiculos_menu);
        menuBar.add(cargas_menu);
        menuBar.add(relatorios_menu);
        menuBar.add(consulta_entrega);

        // Cria e adiciona um item para o menu
        JMenuItem carregamento = new JMenuItem("Carregamento");

        carregamento.addActionListener((action) -> {
            System.out.println("CARREGAMENTISSIMO");
        });

        JMenuItem entrega_crud = new JMenuItem("Entrega");

        entrega_crud.addActionListener((action) -> {

        });

        JMenuItem filial = new JMenuItem("Filial");

        filial.addActionListener((action) -> {

        });

        JMenuItem pessoa = new JMenuItem("Pessoa");

        pessoa.addActionListener((action) -> {

        });
        
        JMenuItem pessoa_fisica = new JMenuItem("Pessoa Física");

        pessoa_fisica.addActionListener((action) -> {

        });

        JMenuItem pessoa_juridica = new JMenuItem("Pessoa Juridica");

        pessoa_juridica.addActionListener((action) -> {

        });

        JMenuItem usuario = new JMenuItem("Usuario");

        usuario.addActionListener((action) -> {

        });

        JMenuItem veiculo = new JMenuItem("Veiculo");

        veiculo.addActionListener((action) -> {

        });

        JMenuItem volume = new JMenuItem("Volume");

        volume.addActionListener((action) -> {

        });

        JMenuItem cargas = new JMenuItem("Cargas");

        cargas.addActionListener((action) -> {

        });

        JMenuItem clientes = new JMenuItem("Clientes");

        clientes.addActionListener((action) -> {

        });

        JMenuItem consulta_veiculos = new JMenuItem("Veiculos");

        consulta_veiculos.addActionListener((action) -> {

        });

        JMenuItem motoristas = new JMenuItem("Motoristas");

        motoristas.addActionListener((action) -> {

        });

        JMenuItem entregas = new JMenuItem("Entregas");

        entregas.addActionListener((action) -> {

        });

        JMenuItem volumes = new JMenuItem("Volumes");

        volumes.addActionListener((action) -> {

        });

        JMenuItem entrega_consult = new JMenuItem("Consultar entrega");

        entrega_consult.addActionListener((action) -> {

        });

        JMenuItem transportadora = new JMenuItem("Trasportadora Redespacho");

        transportadora.addActionListener((action) -> {

        });

        JMenuItem veiculos_verif_em_reparo = new JMenuItem("Veículos em reparo");
        JMenuItem veiculos_verif_aguard_reparo = new JMenuItem("Veículos aguardando reparo");

        ButtonGroup bg = new ButtonGroup();
        crud_menu.add(carregamento);
        crud_menu.add(entrega_crud);
        crud_menu.add(filial);
        crud_menu.add(pessoa);
        crud_menu.add(usuario);
        crud_menu.add(veiculo);
        crud_menu.add(volume);
        crud_menu.add(transportadora);

        verif_veiculos_menu.add(veiculos_verif_em_reparo);
        verif_veiculos_menu.add(veiculos_verif_aguard_reparo);

        consulta_adm_menu.add(cargas);
        consulta_adm_menu.add(clientes);
        consulta_adm_menu.add(consulta_veiculos);
        consulta_adm_menu.add(motoristas);
        consulta_adm_menu.add(entregas);
        consulta_adm_menu.add(volumes);

        consulta_entrega.add(entrega_consult);
    }
}
