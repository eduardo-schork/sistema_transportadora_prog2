package views.forms;

import controllers.VolumeController;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FormVolume extends BaseForm {

    private JLabel labelID;
    private JLabel labelPesoBruto;
    private JLabel labelPesoLiquido;
    private JLabel labelCubagem;

    private JTextField textFieldID;
    private JTextField textFieldPesoBruto;
    private JTextField textFieldPesoLiquido;
    private JTextField textFieldCubagem;

    private GridBagConstraints cons;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormVolume() {
        super("Formulário Volume", new Dimension(400, 250), new VolumeController());

        initComponents();
        addComponents();
    }

    private void initComponents() {
        labelID = new JLabel("ID:  ");
        labelPesoBruto = new JLabel("Peso Bruto:  ");
        labelPesoLiquido = new JLabel("Peso Líquido:  ");
        labelCubagem = new JLabel("Cubagem:  ");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelPesoBruto.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelPesoLiquido.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelCubagem.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        labelID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelPesoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        labelPesoLiquido.setHorizontalAlignment(SwingConstants.RIGHT);
        labelCubagem.setHorizontalAlignment(SwingConstants.RIGHT);

        textFieldID = new JTextField();
        textFieldPesoBruto = new JTextField();
        textFieldPesoLiquido = new JTextField();
        textFieldCubagem = new JTextField();

        textFieldID.setEditable(false);

        textFieldID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldPesoBruto.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldPesoLiquido.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        textFieldCubagem.setFont(new Font("Arial", Font.PLAIN, (int) 18));

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
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridy = 0;
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
        panelFormulario.add(labelPesoBruto, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldPesoBruto, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 2;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelPesoLiquido, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 2;
        cons.gridwidth = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldPesoLiquido, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 3;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelCubagem, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 3;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldCubagem, cons);

        super.addFormulario(panelFormulario);
    }
}
