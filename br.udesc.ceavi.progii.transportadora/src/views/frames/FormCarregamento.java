/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.frames;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class FormCarregamento extends BaseForm {

    private JLabel labelID;
    private JLabel labelEntrega;
    private JLabel labelEnderecoSaida;
    private JLabel labelEnderecoChegada;

    private JTextField textFieldID;
    private JComboBox comboBoxEntrega;
    private JComboBox comboBoxEnderecoSaida;
    private JComboBox comboBoxEnderecoChegada;

    private Dimension dimensaoBotao;
    private JButton buttonAdicionarEntrega;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormCarregamento() {
        super("Formulário Carregamento", new Dimension(400, 250));

        initComponents();
        addComponents();
    }

    private void initComponents() {

        dimensaoBotao = new Dimension(100, 20);
        buttonAdicionarEntrega = new JButton("Adicionar Entrega");
        buttonAdicionarEntrega.setSize(dimensaoBotao);

        labelID = new JLabel("ID:");
        labelEntrega = new JLabel("Entrega:");
        labelEnderecoSaida = new JLabel("Endereço Saída:");
        labelEnderecoChegada = new JLabel("Endereço Chegada:");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelEntrega.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelEnderecoSaida.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelEnderecoChegada.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        labelID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelEntrega.setHorizontalAlignment(SwingConstants.RIGHT);
        labelEnderecoSaida.setHorizontalAlignment(SwingConstants.RIGHT);
        labelEnderecoChegada.setHorizontalAlignment(SwingConstants.RIGHT);

        textFieldID = new JTextField();

        //fill data com entregas
        comboBoxEntrega = new JComboBox();

        //fill data com enderecos
        comboBoxEnderecoSaida = new JComboBox();

        //fill data com enderecos
        comboBoxEnderecoChegada = new JComboBox();

        textFieldID.setEditable(false);

        textFieldID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxEntrega.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxEnderecoSaida.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxEnderecoChegada.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        layout = new GridLayout(5, 2);

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        panelFormulario.add(labelID);
        panelFormulario.add(textFieldID);
        panelFormulario.add(labelEnderecoSaida);
        panelFormulario.add(comboBoxEnderecoSaida);
        panelFormulario.add(labelEnderecoChegada);
        panelFormulario.add(comboBoxEnderecoChegada);
        panelFormulario.add(labelEntrega);
        panelFormulario.add(comboBoxEntrega);
        panelFormulario.add(new JLabel());
        panelFormulario.add(buttonAdicionarEntrega);

        super.addFormulario(panelFormulario);
    }
}
