package views.frames;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import models.TipoPessoa;


public class FormUsuario extends BaseForm {

    private JLabel labelID;
    private JLabel labelPessoa;
    private JLabel labelTipo;
    private JLabel labelLogin;
    private JLabel labelSenha;
    private JTextField textFieldID;
    private JComboBox comboBoxPessoa;
    private JComboBox comboBoxTipo;
    private JTextField textFieldLogin;
    private JTextField textFieldSenha;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormUsuario() {
        super("Formulário Usuário", new Dimension(400, 200));

        initComponents();
        addComponents();
    }

    private void initComponents() {
        labelID = new JLabel("ID:");
        labelPessoa = new JLabel("Pessoa:");
        labelTipo = new JLabel("Tipo:");
        labelLogin = new JLabel("Login:");
        labelSenha = new javax.swing.JLabel("Senha:");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelPessoa.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelTipo.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelLogin.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelSenha.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        labelID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelPessoa.setHorizontalAlignment(SwingConstants.RIGHT);
        labelTipo.setHorizontalAlignment(SwingConstants.RIGHT);
        labelLogin.setHorizontalAlignment(SwingConstants.RIGHT);
        labelSenha.setHorizontalAlignment(SwingConstants.RIGHT);

        textFieldID = new JTextField();
        textFieldLogin = new JTextField();
        textFieldSenha = new JTextField();

        comboBoxPessoa = new JComboBox();
        comboBoxPessoa.setSelectedIndex(-1);

        comboBoxTipo = new JComboBox(TipoPessoa.values());
        comboBoxTipo.setSelectedIndex(-1);

        textFieldID.setEditable(false);

        textFieldID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldLogin.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldSenha.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxPessoa.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxTipo.setFont(new Font("Arial", Font.PLAIN, (int) 18));

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
