package views.frames;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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

    private GridBagConstraints cons;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormEndereco() {
        super("Formulário Endereço", new Dimension(450, 300));

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
        labelPais = new JLabel("País:  ");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelNumero.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelCEP.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelRua.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelBairro.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelCidade.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelEstado.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelPais.setFont(new Font("Arial", Font.PLAIN, (int) 18));

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

        layout = new GridBagLayout();

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
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
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelNumero, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldNumero, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 2;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelCEP, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 2;
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldCEP, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 3;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelRua, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 3;
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldRua, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 4;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelBairro, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 4;
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldBairro, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 5;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelCidade, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 5;
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldCidade, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 6;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelEstado, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 6;
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldEstado, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 7;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelPais, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 7;
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldPais, cons);

        super.addFormulario(panelFormulario);
    }
}
