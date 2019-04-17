package views.forms;

import controllers.TrackingEntregaController;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
    private JLabel labelEntrega;

    private JTextField textFieldID;
    private JComboBox comboBoxSituacao;
    private JTextField textFieldData;
    private JComboBox comboBoxUsuario;
    private JComboBox comboBoxEntrega;

    private GridBagConstraints cons;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormTrackingEntrega() {
        super("Formulário Tracking de Entrega", new Dimension(400, 250), new TrackingEntregaController());

        initComponents();
        addComponents();
    }

    private void initComponents() {

        labelID = new JLabel("ID:  ");
        labelEntrega = new JLabel("Entrega:  ");
        labelSituacao = new JLabel("Situação:  ");
        labelData = new JLabel("Data:  ");
        labelUsuario = new JLabel("Usuário:  ");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelSituacao.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelUsuario.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelData.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelEntrega.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        labelID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelSituacao.setHorizontalAlignment(SwingConstants.RIGHT);
        labelUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
        labelData.setHorizontalAlignment(SwingConstants.RIGHT);
        labelEntrega.setHorizontalAlignment(SwingConstants.RIGHT);

        textFieldID = new JTextField();
        comboBoxSituacao = new JComboBox();
        comboBoxUsuario = new JComboBox();
        textFieldData = new JTextField();
        comboBoxEntrega = new JComboBox();

        textFieldID.setEditable(false);

        textFieldID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxSituacao.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxUsuario.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldData.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxEntrega.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        layout = new GridBagLayout();

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelID, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 0;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldID, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelID, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldID, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 2;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelSituacao, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 2;
        cons.gridwidth = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(comboBoxSituacao, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 3;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelUsuario, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 3;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(comboBoxUsuario, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 4;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelData, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 4;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldData, cons);

        super.addFormulario(panelFormulario);
    }
}
