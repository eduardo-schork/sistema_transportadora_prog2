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
         
        setTitle("Menu TransUdesc");
        setSize(1024, 768);
         
        // Cria uma barra de menu para o JFrame
        JMenuBar menuBar = new JMenuBar();
         
        // Adiciona a barra de menu ao  frame
        setJMenuBar(menuBar);
         
        JMenu cadastros = new JMenu("Cadastros");
        JMenu consulta = new JMenu("Consultas");
        JMenu veiculos = new JMenu("Veículos");
//        JMenu editMenu = new JMenu("Editar");
        menuBar.add(cadastros);
        menuBar.add(consulta);
//        menuBar.add(editMenu);
         
        // Cria e adiciona um item simples para o menu
        JMenuItem carregamento = new JMenuItem("Carregamento");
        JMenuItem entrega = new JMenuItem("Entrega");
        JMenuItem filial = new JMenuItem("Filial");
        JMenuItem pessoa_fisica = new JMenuItem("Pessoa Física");
        JMenuItem pessoa_juridica = new JMenuItem("Pessoa Juridica");
        JMenuItem situacao_entrega = new JMenuItem("Situação entrega");
        JMenuItem status_veiculo = new JMenuItem("Status Veiculo");
        JMenuItem usuario = new JMenuItem("Usuario");
        JMenuItem veiculo = new JMenuItem("Veiculo");
        JMenuItem volume = new JMenuItem("Volume");
        
        JMenuItem cargas = new JMenuItem("Cargas");
        JMenuItem clientes = new JMenuItem("Clientes");
        JMenuItem consulta_veiculos = new JMenuItem("Veiculos");
        JMenuItem motoristas = new JMenuItem("Motoristas");
        JMenuItem entregas = new JMenuItem("Entregas");
        JMenuItem volumes = new JMenuItem("Volumes");
        
        ButtonGroup bg = new ButtonGroup();
        cadastros.add(carregamento);
        cadastros.add(entrega);
//        cadastros.addSeparator();
        cadastros.add(filial);
        cadastros.add(pessoa_fisica);
        cadastros.add(pessoa_juridica);
        cadastros.add(situacao_entrega);
        cadastros.add(status_veiculo);
        cadastros.add(usuario);
        cadastros.add(veiculo);
        cadastros.add(volume);
        
        consulta.add(cargas);
        consulta.add(clientes);
        consulta.add(consulta_veiculos);
        consulta.add(motoristas);
        consulta.add(entregas);
        consulta.add(volumes);
    }
}
    