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

public class FormTrakingCarregamento extends BaseForm {

    private JLabel labelID;
    private JLabel labelSituacao;
    private JLabel labelData;
    private JLabel labelCarregamento;

    private JTextField textFieldID;
    private JComboBox comboBoxSituacao;
    private JTextField textFieldData;
    private JComboBox comboBoxCarregamento;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormTrakingCarregamento() {
        super("Formulário Tracking de Carregamento", new Dimension(400, 200));

        initComponents();
        addComponents();
    }

    private void initComponents() {

        labelID = new JLabel("ID:  ");
        labelSituacao = new JLabel("Situação:  ");
        labelData = new JLabel("Data:  ");
        labelCarregamento = new JLabel("Carregamento:  ");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelSituacao.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelCarregamento.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelData.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        labelID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelSituacao.setHorizontalAlignment(SwingConstants.RIGHT);
        labelCarregamento.setHorizontalAlignment(SwingConstants.RIGHT);
        labelData.setHorizontalAlignment(SwingConstants.RIGHT);

        textFieldID = new JTextField();
        comboBoxSituacao = new JComboBox();
        comboBoxCarregamento = new JComboBox();
        textFieldData = new JTextField();

        textFieldID.setEditable(false);

        textFieldID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxSituacao.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxCarregamento.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldData.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        layout = new GridLayout(4, 2);

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        panelFormulario.add(labelID);
        panelFormulario.add(textFieldID);
        panelFormulario.add(labelSituacao);
        panelFormulario.add(comboBoxSituacao);
        panelFormulario.add(labelCarregamento);
        panelFormulario.add(comboBoxCarregamento);
        panelFormulario.add(labelData);
        panelFormulario.add(textFieldData);

        super.addFormulario(panelFormulario);
    }
}
