package br.udesc.ceavi.progii.transudesc.view.frames;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import transudesc.TipoPessoa;

public class FormUsuario extends BaseForm{

    private Label labelID;
    private Label labelPessoa;
    private Label labelTipo;
    private Label labelLogin;
    private Label labelSenha;
    private JTextField textFieldID;
    private JComboBox comboBoxPessoa;
    private JComboBox comboBoxTipo;
    private JTextField textFieldLogin;
    private JTextField textFieldSenha;
   
    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    
    public FormUsuario() {
        super("Formulário Usuário", new Dimension(350, 200));

        initComponents();
        addComponents();
    }

    private void initComponents() {
        labelID = new Label("ID:");
        labelPessoa = new Label("Pessoa:");
        labelTipo = new Label("Tipo:");
        labelLogin = new Label("Login:");
        labelSenha = new Label("Senha:");

        textFieldID = new JTextField();
        textFieldLogin = new JTextField();
        textFieldSenha = new JTextField();
        
        comboBoxPessoa = new JComboBox();
        comboBoxPessoa.setSelectedIndex(-1);
        
        comboBoxTipo = new JComboBox(TipoPessoa.values());
        comboBoxTipo.setSelectedIndex(-1);

        layout = new GridLayout(5, 2);

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        panelFormulario.add(labelID);
        panelFormulario.add(textFieldID);
        panelFormulario.add(labelPessoa);
        panelFormulario.add(comboBoxPessoa);
        panelFormulario.add(labelTipo);
        panelFormulario.add(comboBoxTipo);
        panelFormulario.add(labelLogin);
        panelFormulario.add(textFieldLogin);
        panelFormulario.add(labelSenha);
        panelFormulario.add(textFieldSenha);
        super.addFormulario(panelFormulario);
    }
}
