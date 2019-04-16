package views.frames;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FormPessoaFisica extends BaseForm {

    private JLabel labelID;
    private JLabel labelNome;
    private JLabel labelSobrenome;
    private JLabel labelCPF;
    private JLabel labelDataNascimento;
    private JTextField textFieldID;
    private JTextField textFieldNome;
    private JTextField textFieldSobrenome;
    private JTextField textFieldCPF;
    private JTextField textFieldDataNascimento;
    private JPanel panelFormulario;

    private Dimension dimensao;
    private LayoutManager layout;

    public FormPessoaFisica() {
        super("Formulário Pessoa Física", new Dimension(400, 200));

        initComponents();
        addComponents();
    }

    private void initComponents() {

        labelID = new JLabel("ID:");
        labelNome = new JLabel("Nome:");
        labelSobrenome = new JLabel("Sobrenome:");
        labelCPF = new JLabel("CPF:");
        labelDataNascimento = new JLabel("Data Nascimento:");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelNome.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelSobrenome.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelCPF.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelDataNascimento.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        labelID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelNome.setHorizontalAlignment(SwingConstants.RIGHT);
        labelSobrenome.setHorizontalAlignment(SwingConstants.RIGHT);
        labelCPF.setHorizontalAlignment(SwingConstants.RIGHT);
        labelDataNascimento.setHorizontalAlignment(SwingConstants.RIGHT);

        textFieldID = new JTextField();
        textFieldNome = new JTextField();
        textFieldSobrenome = new JTextField();
        textFieldCPF = new JTextField();
        textFieldDataNascimento = new JTextField();

        textFieldID.setEditable(false);
        
        textFieldID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldNome.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldSobrenome.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldCPF.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldDataNascimento.setFont(new Font("Arial", Font.PLAIN, (int) 18));

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
