package views.frames;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FormTransRedespacho extends BaseForm {

    private JLabel labelID;
    private JLabel labelNome;
    private JLabel labelSobrenome;
    private JLabel labelNomeFantasia;
    private JLabel labelCNPJ;
    private JLabel labelPessoaJuridica;
    private JLabel labelPessoaID;
    private JLabel labelIE;
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
        super("Formulário Transportadora Redespacho", new Dimension(400, 300));

        initComponents();
        addComponents();
    }

    private void initComponents() {

        labelID = new JLabel("ID:  ");
        labelPessoaJuridica = new JLabel("Pessoa:  ");
        labelPessoaID = new JLabel("Pessoa ID:  ");
        labelNome = new JLabel("Nome:  ");
        labelSobrenome = new JLabel("Sobrenome:  ");
        labelNomeFantasia = new JLabel("Nome Fantasia:  ");
        labelCNPJ = new JLabel("CNPJ:  ");
        labelIE = new javax.swing.JLabel("IE:  ");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelPessoaJuridica.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelPessoaID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelNome.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelSobrenome.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelNomeFantasia.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelCNPJ.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelIE.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        labelID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelPessoaJuridica.setHorizontalAlignment(SwingConstants.RIGHT);
        labelPessoaID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelNome.setHorizontalAlignment(SwingConstants.RIGHT);
        labelNomeFantasia.setHorizontalAlignment(SwingConstants.RIGHT);
        labelSobrenome.setHorizontalAlignment(SwingConstants.RIGHT);
        labelCNPJ.setHorizontalAlignment(SwingConstants.RIGHT);
        labelIE.setHorizontalAlignment(SwingConstants.RIGHT);

        textFieldID = new JTextField();
        comboBoxPessoaJuridica = new JComboBox();
        textFieldPessoaID = new JTextField();
        textFieldNome = new JTextField();
        textFieldSobrenome = new JTextField();
        textFieldNomeFantasia = new JTextField();
        textFieldCNPJ = new JTextField();
        textFieldIE = new JTextField();

        textFieldID.setEditable(false);
        
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
