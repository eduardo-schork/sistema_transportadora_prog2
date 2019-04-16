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
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormEndereco extends BaseForm {

    private Label labelID;
    private Label labelNumero;
    private Label labelCEP;
    private Label labelRua;
    private Label labelBairro;
    private Label labelCidade;
    private Label labelEstado;
    private Label labelPais;
    private JTextField textFieldID;
    private JTextField textFieldNumero;
    private JTextField textFieldCEP;
    private JTextField textFieldBairro;
    private JTextField textFieldCidade;
    private JTextField textFieldRua;
    private JTextField textFieldEstado;
    private JTextField textFieldPais;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormEndereco() {
        super("Formulário Endereco", new Dimension(350, 250));

        initComponents();
        addComponents();
    }

    private void initComponents() {

        labelID = new Label("ID:");
        labelNumero = new Label("Numero:");
        labelCEP = new Label("CEP:");
        labelRua = new Label("Rua:");
        labelBairro = new Label("Bairro:");
        labelCidade = new Label("Cidade:");
        labelEstado = new Label("Estado:");
        labelPais = new Label("Pais:");

        textFieldID = new JTextField();
        textFieldNumero = new JTextField();
        textFieldCEP = new JTextField();
        textFieldRua = new JTextField();
        textFieldBairro = new JTextField();
        textFieldCidade = new JTextField();
        textFieldEstado = new JTextField();
        textFieldPais = new JTextField();

        layout = new GridLayout(8, 2);

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        panelFormulario.add(labelID);
        panelFormulario.add(textFieldID);
        panelFormulario.add(labelNumero);
        panelFormulario.add(textFieldNumero);
        panelFormulario.add(labelCEP);
        panelFormulario.add(textFieldCEP);
        panelFormulario.add(labelRua);
        panelFormulario.add(textFieldRua);
        panelFormulario.add(labelBairro);
        panelFormulario.add(textFieldBairro);
        panelFormulario.add(labelCidade);
        panelFormulario.add(textFieldCidade);
        panelFormulario.add(labelEstado);
        panelFormulario.add(textFieldEstado);
        panelFormulario.add(labelPais);
        panelFormulario.add(textFieldPais);
        super.addFormulario(panelFormulario);
    }
}
