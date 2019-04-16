package views.frames;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FormFilial extends BaseForm {

    private JLabel labelID;
    private JLabel labelNome;
    private JLabel labelEndereco;

    private JTextField textFieldID;
    private JTextField textFieldNome;
    private JComboBox comboBoxEndereco;

    private Dimension dimensaoBotao;
    private JButton buttonAdicionarVolume;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormFilial() {
        super("Formulário Filial", new Dimension(400, 150));

        initComponents();
        addComponents();
    }

    private void initComponents() {

        dimensaoBotao = new Dimension(100, 20);
        buttonAdicionarVolume = new JButton("Adicionar Volume");
        buttonAdicionarVolume.setSize(dimensaoBotao);

        labelID = new JLabel("ID:  ");
        labelNome = new JLabel("Nome:  ");
        labelEndereco = new JLabel("Endereço:  ");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelNome.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelEndereco.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        labelID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelNome.setHorizontalAlignment(SwingConstants.RIGHT);
        labelEndereco.setHorizontalAlignment(SwingConstants.RIGHT);

        textFieldID = new JTextField();
        textFieldNome = new JTextField();

        //fill data com enderecos
        comboBoxEndereco = new JComboBox();

        textFieldID.setEditable(false);

        textFieldID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldNome.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxEndereco.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        layout = new GridLayout(3, 2);

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        panelFormulario.add(labelID);
        panelFormulario.add(textFieldID);
        panelFormulario.add(labelNome);
        panelFormulario.add(textFieldNome);
        panelFormulario.add(labelEndereco);
        panelFormulario.add(comboBoxEndereco);

        super.addFormulario(panelFormulario);
    }
}
