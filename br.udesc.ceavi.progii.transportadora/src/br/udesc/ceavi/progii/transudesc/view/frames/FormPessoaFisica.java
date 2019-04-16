package br.udesc.ceavi.progii.transudesc.view.frames;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormPessoaFisica extends BaseForm {

    private Label labelID;
    private Label labelNome;
    private Label labelSobrenome;
    private Label labelCPF;
    private Label labelDataNascimento;
    private JTextField textFieldID;
    private JTextField textFieldNome;
    private JTextField textFieldSobrenome;
    private JTextField textFieldCPF;
    private JTextField textFieldDataNascimento;
    private JPanel panelFormulario;

    private Dimension dimensao;
    private LayoutManager layout;

    public FormPessoaFisica() {
        super("Formulário Pessoa Física", new Dimension(350, 200));

        initComponents();
        addComponents();
    }

    private void initComponents() {

        labelID = new Label("ID:");
        labelNome = new Label("Nome:");
        labelSobrenome = new Label("Sobrenome:");
        labelCPF = new Label("CPF:");
        labelDataNascimento = new Label("Data Nascimento:");

        
        textFieldID = new JTextField();
        textFieldNome = new JTextField();
        textFieldSobrenome = new JTextField();
        textFieldCPF = new JTextField();
        textFieldDataNascimento = new JTextField();

        layout = new GridLayout(5, 2);

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
        panelFormulario.add(labelCPF);
        panelFormulario.add(textFieldCPF);
        panelFormulario.add(labelDataNascimento);
        panelFormulario.add(textFieldDataNascimento);
        super.addFormulario(panelFormulario);
    }
}
