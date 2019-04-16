package br.udesc.ceavi.progii.transudesc.view.frames;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import transudesc.StatusVeiculo;
import transudesc.TipoVeiculo;

public class FormVeiculo extends BaseForm {

    private Label labelID;
    private Label labelPlaca;
    private Label labelDataAquisicao;
    private Label labelTipo;
    private Label labelStatus;
    private JTextField textFieldID;
    private JTextField textFieldPlaca;
    private JTextField textFieldDataAquisicao;
    private JComboBox comboBoxTipo;
    private JComboBox comboBoxStatus;
    private JPanel panelFormulario;

    private Dimension dimensao;
    private LayoutManager layout;

    public FormVeiculo() {
        super("Formulário Veiculo", new Dimension(350, 200));

        initComponents();
        addComponents();
    }

    private void initComponents() {
        labelID = new Label("ID:");
        labelPlaca = new Label("Placa:");
        labelDataAquisicao = new Label("Data Aquisição:");
        labelTipo = new Label("Tipo:");
        labelStatus = new Label("Status:");

        textFieldID = new JTextField();
        textFieldPlaca = new JTextField();
        textFieldDataAquisicao = new JTextField();

        comboBoxTipo = new JComboBox(TipoVeiculo.values());
        comboBoxTipo.setSelectedIndex(-1);

        comboBoxStatus = new JComboBox(StatusVeiculo.values());
        comboBoxStatus.setSelectedIndex(-1);

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
