package br.udesc.ceavi.progii.transudesc.view.frames;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Schork
 */
public class FormVolume extends BaseForm {

    private Label labelID;
    private Label labelPesoBruto;
    private Label labelPesoLiquido;
    private Label labelCubagem;
    private JTextField textFieldID;
    private JTextField textFieldPesoBruto;
    private JTextField textFieldPesoLiquido;
    private JTextField textFieldCubagem;
    private JPanel panelFormulario;

    private Dimension dimensao;
    private LayoutManager layout;

    public FormVolume() {
        super("Formulário Volume", new Dimension(350, 200));

        initComponents();
        addComponents();
    }
    
    private void initComponents() {
        labelID = new Label("ID:");
        labelPesoBruto = new Label("Peso Bruto:");
        labelPesoLiquido = new Label("Peso Líquido:");
        labelCubagem = new Label("Cubagem:");

        textFieldID = new JTextField();
        textFieldPesoBruto = new JTextField();
        textFieldPesoLiquido = new JTextField();
        textFieldCubagem = new JTextField();

        layout = new GridLayout(4, 2);

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        panelFormulario.add(labelID);
        panelFormulario.add(textFieldID);
        panelFormulario.add(labelPesoBruto);
        panelFormulario.add(textFieldPesoBruto);
        panelFormulario.add(labelPesoLiquido);
        panelFormulario.add(textFieldPesoLiquido);
        panelFormulario.add(labelCubagem);
        panelFormulario.add(textFieldCubagem);
        super.addFormulario(panelFormulario);
    }
}
