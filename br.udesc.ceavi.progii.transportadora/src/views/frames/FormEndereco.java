package views.frames;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FormEndereco extends BaseForm {

    private JLabel labelID;
    private JLabel labelNumero;
    private JLabel labelCEP;
    private JLabel labelRua;
    private JLabel labelBairro;
    private JLabel labelCidade;
    private JLabel labelEstado;
    private JLabel labelPais;
    private JTextField textFieldID;
    private JTextField textFieldNumero;
    private JTextField textFieldCEP;
    private JTextField textFieldBairro;
    private JTextField textFieldCidade;
    private JTextField textFieldRua;
    private JTextField textFieldEstado;
    private JTextField textFieldPais;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormEndereco() {
        super("Formulário Endereco", new Dimension(400, 300));

        initComponents();
        addComponents();
    }

    private void initComponents() {

        labelID = new JLabel("ID:  ");
        labelNumero = new JLabel("Numero:  ");
        labelCEP = new JLabel("CEP:  ");
        labelRua = new JLabel("Rua:  ");
        labelBairro = new JLabel("Bairro:  ");
        labelCidade = new JLabel("Cidade:  ");
        labelEstado = new JLabel("Estado:  ");
        labelPais = new JLabel("Pais:  ");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int)18));
        labelNumero.setFont(new Font("Arial", Font.PLAIN, (int)18));
        labelCEP.setFont(new Font("Arial", Font.PLAIN, (int)18));
        labelRua.setFont(new Font("Arial", Font.PLAIN, (int)18));
        labelBairro.setFont(new Font("Arial", Font.PLAIN, (int)18));
        labelCidade.setFont(new Font("Arial", Font.PLAIN, (int)18));
        labelEstado.setFont(new Font("Arial", Font.PLAIN, (int)18));
        labelPais.setFont(new Font("Arial", Font.PLAIN, (int)18));
        
        labelID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        labelCEP.setHorizontalAlignment(SwingConstants.RIGHT);
        labelRua.setHorizontalAlignment(SwingConstants.RIGHT);
        labelBairro.setHorizontalAlignment(SwingConstants.RIGHT);
        labelCidade.setHorizontalAlignment(SwingConstants.RIGHT);
        labelEstado.setHorizontalAlignment(SwingConstants.RIGHT);
        labelPais.setHorizontalAlignment(SwingConstants.RIGHT);

        textFieldID = new JTextField();
        textFieldNumero = new JTextField();
        textFieldCEP = new JTextField();
        textFieldRua = new JTextField();
        textFieldBairro = new JTextField();
        textFieldCidade = new JTextField();
        textFieldEstado = new JTextField();
        textFieldPais = new JTextField();

        textFieldID.setEditable(false);
        
        textFieldID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldNumero.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldCEP.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldRua.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldBairro.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldCidade.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldEstado.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldPais.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        
        layout = new GridLayout(8, 2);

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        panelFormulario.add(labelID);
        panelFormulario.add(textFieldID);
        panelFormulario.add(labelNumero);
        panelFormulario.add(textFieldNumero);
        panelFormulario.add(labelCEP);
        panelFormulario.add(textFieldCEP);
        panelFormulario.add(labelRua);
        panelFormulario.add(textFieldRua);
        panelFormulario.add(labelBairro);
        panelFormulario.add(textFieldBairro);
        panelFormulario.add(labelCidade);
        panelFormulario.add(textFieldCidade);
        panelFormulario.add(labelEstado);
        panelFormulario.add(textFieldEstado);
        panelFormulario.add(labelPais);
        panelFormulario.add(textFieldPais);
        super.addFormulario(panelFormulario);
    }
}
