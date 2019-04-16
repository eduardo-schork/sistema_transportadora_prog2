package views.frames;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
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

    private GridBagConstraints cons;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormUsuario() {
        super("Formulário Usuário", new Dimension(450, 300));

        initComponents();
        addComponents();
    }

    private void initComponents() {
        labelID = new JLabel("ID:  ");
        labelPessoa = new JLabel("Pessoa:  ");
        labelTipo = new JLabel("Tipo:  ");
        labelLogin = new JLabel("Login:  ");
        labelSenha = new javax.swing.JLabel("Senha:  ");

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

        layout = new GridBagLayout();

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelID, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldID, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelPessoa, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(comboBoxPessoa, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 2;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelTipo, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 2;
        cons.gridwidth = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(comboBoxTipo, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 3;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelLogin, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridy = 3;
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldLogin, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 4;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelSenha, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 4;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldSenha, cons);

        super.addFormulario(panelFormulario);
    }
}
