/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.progii.transudesc.view.frames;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import transudesc.SituacaoEntrega;

/**
 *
 * @author Schork
 */
public class FormEntrega extends BaseForm {

    private Label labelID;
    private Label labelEnderecoDestino;
    private Label labelSituacao;
    private Label labelVolume;
    private Label labelRedespacho;

    private JTextField textFieldID;
    private JComboBox comboBoxEnderecoDestino;
    private JComboBox comboBoxSituacao;
    private JComboBox comboBoxVolume;
    private JComboBox comboBoxRedespacho;

    private Dimension dimensaoBotao;
    private JButton buttonAdicionarVolume;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormEntrega() {
        super("Formulário Entrega", new Dimension(350, 250));

        initComponents();
        addComponents();
    }

    private void initComponents() {

        dimensaoBotao = new Dimension(100, 20);
        buttonAdicionarVolume = new JButton("Adicionar Volume");
        buttonAdicionarVolume.setSize(dimensaoBotao);

        labelID = new Label("ID:");
        labelEnderecoDestino = new Label("Endereço Destino:");
        labelSituacao = new Label("Situação:");
        labelVolume = new Label("Volume:");
        labelRedespacho = new Label("Trans. Redespacho:");

        textFieldID = new JTextField();
        //fill data com enderecos
        comboBoxEnderecoDestino = new JComboBox();

        comboBoxSituacao = new JComboBox(SituacaoEntrega.values());

        //fill data com volumes
        comboBoxVolume = new JComboBox();

        //fill data com redespachos
        comboBoxRedespacho = new JComboBox();

        layout = new GridLayout(6, 2);

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        panelFormulario.add(labelID);
        panelFormulario.add(textFieldID);
        panelFormulario.add(labelEnderecoDestino);
        panelFormulario.add(comboBoxEnderecoDestino);
        panelFormulario.add(labelSituacao);
        panelFormulario.add(comboBoxSituacao);
        panelFormulario.add(labelRedespacho);
        panelFormulario.add(comboBoxRedespacho);
        panelFormulario.add(labelVolume);
        panelFormulario.add(comboBoxVolume);
        panelFormulario.add(new JLabel());
        panelFormulario.add(buttonAdicionarVolume);

        super.addFormulario(panelFormulario);
    }
}
