package views.frames;

//private int id;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FormTrackingEntrega extends BaseForm {

    private JLabel labelID;
    private JLabel labelSituacao;
    private JLabel labelData;
    private JLabel labelUsuario;

    private JTextField textFieldID;
    private JComboBox comboBoxSituacao;
    private JTextField textFieldData;
    private JComboBox comboBoxUsuario;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormTrackingEntrega() {
        super("Formulário Tracking de Entrega", new Dimension(400, 200));

        initComponents();
        addComponents();
    }

    private void initComponents() {

        labelID = new JLabel("ID:  ");
        labelSituacao = new JLabel("Situação:  ");
        labelData = new JLabel("Data:  ");
        labelUsuario = new JLabel("Usuário:  ");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelSituacao.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelUsuario.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelData.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        labelID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelSituacao.setHorizontalAlignment(SwingConstants.RIGHT);
        labelUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
        labelData.setHorizontalAlignment(SwingConstants.RIGHT);

        textFieldID = new JTextField();
        comboBoxSituacao = new JComboBox();
        comboBoxUsuario = new JComboBox();
        textFieldData = new JTextField();

        textFieldID.setEditable(false);

        textFieldID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxSituacao.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxUsuario.setFont(new Font("Arial", Font.PLAIN, (int) 18));
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
        panelFormulario.add(labelUsuario);
        panelFormulario.add(comboBoxUsuario);
        panelFormulario.add(labelData);
        panelFormulario.add(textFieldData);

        super.addFormulario(panelFormulario);
    }
}
