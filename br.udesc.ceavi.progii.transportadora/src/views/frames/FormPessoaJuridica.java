package views.frames;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
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
    private JPanel panelFormulario;

    private Dimension dimensao;
    private LayoutManager layout;

    public FormPessoaJuridica() {
        super("Formulário Pessoa Jurídica", new Dimension(400, 200));

        initComponents();
        addComponents();
    }

    private void initComponents() {
        labelID = new JLabel("ID:  ");
        labelNome = new JLabel("Nome:  ");
        labelSobrenome = new JLabel("Sobrenome:  ");
        labelNomeFantasia = new JLabel("Nome Fantasia:  ");
        labelCNPJ = new JLabel("CNPJ:");
        labelIE = new JLabel("IE:");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelNome.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelSobrenome.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelCNPJ.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelIE.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        labelID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelNome.setHorizontalAlignment(SwingConstants.RIGHT);
        labelSobrenome.setHorizontalAlignment(SwingConstants.RIGHT);
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
