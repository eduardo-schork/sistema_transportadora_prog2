package views.frames;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FormPessoaJuridica extends BaseForm {

    private JLabel labelID;
    private JLabel labelNome;
    private JLabel labelSobrenome;
    private JLabel labelNomeFantasia;
    private JLabel labelCNPJ;
    private JLabel labelIE;

    private JTextField textFieldID;
    private JTextField textFieldNome;
    private JTextField textFieldSobrenome;
    private JTextField textFieldNomeFantasia;
    private JTextField textFieldCNPJ;
    private JTextField textFieldIE;

    private GridBagConstraints cons;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormPessoaJuridica() {
        super("Formulário Pessoa Jurídica", new Dimension(400, 300));

        initComponents();
        addComponents();
    }

    private void initComponents() {
        labelID = new JLabel("ID:  ");
        labelNome = new JLabel("Nome:  ");
        labelSobrenome = new JLabel("Sobrenome:  ");
        labelNomeFantasia = new JLabel("Nome Fantasia:  ");
        labelCNPJ = new JLabel("CNPJ:  ");
        labelIE = new JLabel("IE:  ");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelNome.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelSobrenome.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelNomeFantasia.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelCNPJ.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelIE.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        labelID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelNome.setHorizontalAlignment(SwingConstants.RIGHT);
        labelSobrenome.setHorizontalAlignment(SwingConstants.RIGHT);
        labelNomeFantasia.setHorizontalAlignment(SwingConstants.RIGHT);
        labelCNPJ.setHorizontalAlignment(SwingConstants.RIGHT);
        labelIE.setHorizontalAlignment(SwingConstants.RIGHT);

        textFieldID = new JTextField();
        textFieldNome = new JTextField();
        textFieldSobrenome = new JTextField();
        textFieldNomeFantasia = new JTextField();
        textFieldCNPJ = new JTextField();
        textFieldIE = new JTextField();

        textFieldID.setEditable(false);

        textFieldID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldNome.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldSobrenome.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldNomeFantasia.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldCNPJ.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldIE.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        layout = new GridBagLayout();

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelID, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 0;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldID, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelNome, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldNome, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 2;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelSobrenome, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 2;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldSobrenome, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 3;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelNomeFantasia, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 3;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldNomeFantasia, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridy = 4;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelCNPJ, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 4;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldCNPJ, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 5;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelIE, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 5;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldIE, cons);

        super.addFormulario(panelFormulario);
    }
}
