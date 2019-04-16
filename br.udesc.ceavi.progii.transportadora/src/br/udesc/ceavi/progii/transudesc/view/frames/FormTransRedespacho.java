package br.udesc.ceavi.progii.transudesc.view.frames;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormTransRedespacho extends BaseForm {

    private Label labelID;
    private Label labelNome;
    private Label labelSobrenome;
    private Label labelNomeFantasia;
    private Label labelCNPJ;
    private Label labelPessoaJuridica;
    private Label labelPessoaID;
    private Label labelIE;
    private JTextField textFieldID;
    private JTextField textFieldNome;
    private JTextField textFieldPessoaID;
    private JComboBox comboBoxPessoaJuridica;
    private JTextField textFieldSobrenome;
    private JTextField textFieldNomeFantasia;
    private JTextField textFieldCNPJ;
    private JTextField textFieldIE;
    private JPanel panelFormulario;

    private Dimension dimensao;
    private LayoutManager layout;

    public FormTransRedespacho() {
        super("Formulário Transportadora Redespacho", new Dimension(350, 250));

        initComponents();
        addComponents();
    }

    private void initComponents() {

        labelID = new Label("ID:");
        labelPessoaJuridica = new Label("Pessoa:");
        labelPessoaID = new Label("Pessoa ID:");
        labelNome = new Label("Nome:");
        labelSobrenome = new Label("Sobrenome:");
        labelNomeFantasia = new Label("Nome Fantasia:");
        labelCNPJ = new Label("CNPJ:");
        labelIE = new Label("IE:");

        textFieldID = new JTextField();
        comboBoxPessoaJuridica = new JComboBox();
        textFieldPessoaID = new JTextField();
        textFieldNome = new JTextField();
        textFieldSobrenome = new JTextField();
        textFieldNomeFantasia = new JTextField();
        textFieldCNPJ = new JTextField();
        textFieldIE = new JTextField();
        
        textFieldPessoaID.setEditable(false);
        textFieldNome.setEditable(false);
        textFieldSobrenome.setEditable(false);
        textFieldNomeFantasia.setEditable(false);
        textFieldCNPJ.setEditable(false);
        textFieldIE.setEditable(false);

        layout = new GridLayout(8, 2);

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        panelFormulario.add(labelID);
        panelFormulario.add(textFieldID);
        panelFormulario.add(labelPessoaJuridica);
        panelFormulario.add(comboBoxPessoaJuridica);
        panelFormulario.add(labelPessoaID);
        panelFormulario.add(textFieldPessoaID);
        panelFormulario.add(labelNome);
        panelFormulario.add(textFieldNome);
        panelFormulario.add(labelSobrenome);
        panelFormulario.add(textFieldSobrenome);
        panelFormulario.add(labelNomeFantasia);
        panelFormulario.add(textFieldNomeFantasia);
        panelFormulario.add(labelCNPJ);
        panelFormulario.add(textFieldCNPJ);
        panelFormulario.add(labelIE);
        panelFormulario.add(textFieldIE);
        super.addFormulario(panelFormulario);
    }
}
