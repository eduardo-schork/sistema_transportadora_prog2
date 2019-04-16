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
import models.SituacaoEntrega;


public class FormEntrega extends BaseForm {

    private JLabel labelID;
    private JLabel labelEnderecoDestino;
    private JLabel labelSituacao;
    private JLabel labelVolume;
    private JLabel labelRedespacho;

    private JTextField textFieldID;
    private JComboBox comboBoxEnderecoDestino;
    private JComboBox comboBoxSituacao;
    private JComboBox comboBoxVolume;
    private JComboBox comboBoxRedespacho;

    private Dimension dimensaoBotao;
    private JButton buttonAdicionarVolume;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormEntrega() {
        super("Formulário Entrega", new Dimension(400, 250));

        initComponents();
        addComponents();
    }

    private void initComponents() {

        dimensaoBotao = new Dimension(100, 20);
        buttonAdicionarVolume = new JButton("Adicionar Volume");
        buttonAdicionarVolume.setSize(dimensaoBotao);

        labelID = new JLabel("ID:");
        labelEnderecoDestino = new JLabel("Endereço Destino:");
        labelSituacao = new JLabel("Situação:");
        labelVolume = new JLabel("Volume:");
        labelRedespacho = new JLabel("Trans. Redespacho:");

        labelID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelEnderecoDestino.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelSituacao.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelVolume.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        labelRedespacho.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        labelID.setHorizontalAlignment(SwingConstants.RIGHT);
        labelEnderecoDestino.setHorizontalAlignment(SwingConstants.RIGHT);
        labelSituacao.setHorizontalAlignment(SwingConstants.RIGHT);
        labelSituacao.setHorizontalAlignment(SwingConstants.RIGHT);
        labelVolume.setHorizontalAlignment(SwingConstants.RIGHT);
        labelRedespacho.setHorizontalAlignment(SwingConstants.RIGHT);

        textFieldID = new JTextField();
        //fill data com enderecos
        comboBoxEnderecoDestino = new JComboBox();

        comboBoxSituacao = new JComboBox(SituacaoEntrega.values());

        //fill data com volumes
        comboBoxVolume = new JComboBox();

        //fill data com redespachos
        comboBoxRedespacho = new JComboBox();
        
        textFieldID.setEditable(false);

        textFieldID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxEnderecoDestino.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxSituacao.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxVolume.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxRedespacho.setFont(new Font("Arial", Font.PLAIN, (int) 18));

        layout = new GridLayout(6, 2);

        panelFormulario = new JPanel();
        panelFormulario.setLayout(layout);
    }

    private void addComponents() {
        panelFormulario.add(labelID);
        panelFormulario.add(textFieldID);
        panelFormulario.add(labelEnderecoDestino);
        panelFormulario.add(comboBoxEnderecoDestino);
        panelFormulario.add(labelSituacao);
        panelFormulario.add(comboBoxSituacao);
        panelFormulario.add(labelRedespacho);
        panelFormulario.add(comboBoxRedespacho);
        panelFormulario.add(labelVolume);
        panelFormulario.add(comboBoxVolume);
        panelFormulario.add(new JLabel());
        panelFormulario.add(buttonAdicionarVolume);

        super.addFormulario(panelFormulario);
    }
}
