package br.udesc.ceavi.progii.transudesc.view.frames;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormPessoaJuridica extends BaseForm{
    private Label labelID;
    private Label labelNome;
    private Label labelSobrenome;
    private Label labelNomeFantasia;
    private Label labelCNPJ;
    private Label labelIE;
    private JTextField textFieldID;
    private JTextField textFieldNome;
    private JTextField textFieldSobrenome;
    private JTextField textFieldNomeFantasia;
    private JTextField textFieldCNPJ;
    private JTextField textFieldIE;
    private JPanel panelFormulario;

    private Dimension dimensao;
    private LayoutManager layout;

    public FormPessoaJuridica() {
        super("Formulário Pessoa Jurídica", new Dimension(350, 200));

        initComponents();
        addComponents();
    }

    private void initComponents() {
        labelID = new Label("ID:");
        labelNome = new Label("Nome:");
        labelSobrenome = new Label("Sobrenome:");
        labelNomeFantasia = new Label("Nome Fantasia:");
        labelCNPJ = new Label("CNPJ:");
        labelIE = new Label("IE:");

        textFieldID = new JTextField();
        textFieldNome = new JTextField();
        textFieldSobrenome = new JTextField();
        textFieldNomeFantasia = new JTextField();
        textFieldCNPJ = new JTextField();
        textFieldIE = new JTextField();

        layout = new GridLayout(6, 2);

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        panelFormulario.add(labelID);
        panelFormulario.add(textFieldID);
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
