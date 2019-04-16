/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.frames;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class FormCarregamento extends BaseForm {

    private JLabel labelID;
    private JLabel labelEntrega;
    private JLabel labelEnderecoSaida;
    private JLabel labelEnderecoChegada;

    private JTextField textFieldID;
    private JComboBox comboBoxEntrega;
    private JComboBox comboBoxEnderecoSaida;
    private JComboBox comboBoxEnderecoChegada;

    private JTable tabelaEntregas;
    private JScrollBar scrollBar;

    private Dimension dimensaoBotao;
    private JButton buttonAdicionarEntrega;

    private GridBagConstraints cons;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormCarregamento() {
        super("Formulário Carregamento", new Dimension(400, 450));

        initComponents();
        addComponents();
    }

    private void initComponents() {

        dimensaoBotao = new Dimension(100, 40);
        buttonAdicionarEntrega = new JButton("Adicionar Entrega");
        buttonAdicionarEntrega.setSize(dimensaoBotao);

        labelID = new JLabel("ID:  ");
        labelEntrega = new JLabel("Entrega:  ");
        labelEnderecoSaida = new JLabel("Endereço Saída:  ");
        labelEnderecoChegada = new JLabel("Endereço Chegada:  ");

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

        String[] colunas = {"#", "Situação"};
        Object[][] dados = {};

        tabelaEntregas = new JTable(dados, colunas);
        tabelaEntregas.setEnabled(false);
        
        layout = new GridBagLayout();
        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelID, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 0;
        cons.ipadx = 200;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldID, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelEnderecoSaida, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        cons.ipadx = 200;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(comboBoxEnderecoSaida, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 2;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelEntrega, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 2;
        cons.ipadx = 200;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(comboBoxEnderecoChegada, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 3;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(buttonAdicionarEntrega, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 4;
        cons.ipadx = 350;
        cons.ipady = 200;
        cons.gridwidth = 2;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(new JScrollPane(tabelaEntregas), cons);

        super.addFormulario(panelFormulario);
    }
}
