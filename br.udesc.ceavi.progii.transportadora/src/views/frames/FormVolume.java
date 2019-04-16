package views.frames;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
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
    private JPanel panelFormulario;

    private Dimension dimensao;
    private LayoutManager layout;

    public FormVolume() {
        super("Formulário Volume", new Dimension(400, 200));

        initComponents();
        addComponents();
    }
    
    private void initComponents() {
        labelID = new JLabel("ID:");
        labelPesoBruto = new JLabel("Peso Bruto:");
        labelPesoLiquido = new JLabel("Peso Líquido:");
        labelCubagem = new JLabel("Cubagem:");

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
