package views.frames;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import models.StatusVeiculo;
import models.TipoVeiculo;

public class FormVeiculo extends BaseForm {

    private JLabel labelID;
    private JLabel labelPlaca;
    private JLabel labelDataAquisicao;
    private JLabel labelTipo;
    private JLabel labelStatus;
    private JTextField textFieldID;
    private JTextField textFieldPlaca;
    private JTextField textFieldDataAquisicao;
    private JComboBox comboBoxTipo;
    private JComboBox comboBoxStatus;
    private JPanel panelFormulario;

    private Dimension dimensao;
    private LayoutManager layout;

    public FormVeiculo() {
        super("Formulário Veiculo", new Dimension(400, 200));

        initComponents();
        addComponents();
    }

    private void initComponents() {
        labelID = new JLabel("ID:  ");
        labelPlaca = new JLabel("Placa:  ");
        labelDataAquisicao = new JLabel("Data Aquisição:  ");
        labelTipo = new JLabel("Tipo:  ");
        labelStatus = new JLabel("Status:  ");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelPlaca.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelDataAquisicao.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelTipo.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelStatus.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        
        labelID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelPlaca.setHorizontalAlignment(SwingConstants.RIGHT);
        labelDataAquisicao.setHorizontalAlignment(SwingConstants.RIGHT);
        labelTipo.setHorizontalAlignment(SwingConstants.RIGHT);
        labelStatus.setHorizontalAlignment(SwingConstants.RIGHT);

        textFieldID = new JTextField();
        textFieldPlaca = new JTextField();
        textFieldDataAquisicao = new JTextField();

        comboBoxTipo = new JComboBox(TipoVeiculo.values());
        comboBoxTipo.setSelectedIndex(-1);

        comboBoxStatus = new JComboBox(StatusVeiculo.values());
        comboBoxStatus.setSelectedIndex(-1);

        textFieldID.setEditable(false);
        
        textFieldID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldPlaca.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldDataAquisicao.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxTipo.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxStatus.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        
        layout = new GridLayout(5, 2);

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        panelFormulario.add(labelID);
        panelFormulario.add(textFieldID);
        panelFormulario.add(labelPlaca);
        panelFormulario.add(textFieldPlaca);
        panelFormulario.add(labelDataAquisicao);
        panelFormulario.add(textFieldDataAquisicao);
        panelFormulario.add(labelTipo);
        panelFormulario.add(comboBoxTipo);
        panelFormulario.add(labelStatus);
        panelFormulario.add(comboBoxStatus);
        super.addFormulario(panelFormulario);
    }
}
