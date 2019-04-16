package views.forms;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
    private JTable tabelaVolumes;

    private GridBagConstraints cons;

    private Dimension dimensaoBotao;
    private JButton buttonAdicionarVolume;

    private JPanel panelFormulario;
    private Dimension dimensao;
    private LayoutManager layout;

    public FormEntrega() {
        super("Formulário Entrega", new Dimension(750, 550));

        initComponents();
        addComponents();
    }

    private void initComponents() {

        dimensaoBotao = new Dimension(100, 20);
        buttonAdicionarVolume = new JButton("Adicionar Volume");
        buttonAdicionarVolume.setSize(dimensaoBotao);

        labelID = new JLabel("ID:  ");
        labelEnderecoDestino = new JLabel("Endereço Destino:  ");
        labelSituacao = new JLabel("Situação:  ");
        labelVolume = new JLabel("Volume:  ");
        labelRedespacho = new JLabel("Trans. Redespacho:  ");

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

        String[] colunas = {"#", "P. Líquido", "P. Bruto", "Cubagem"};
        Object[][] dados = {};

        tabelaVolumes = new JTable(dados, colunas);
        tabelaVolumes.setEnabled(false);

        textFieldID.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxEnderecoDestino.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxSituacao.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxVolume.setFont(new Font("Arial", Font.PLAIN, (int) 18));
        comboBoxRedespacho.setFont(new Font("Arial", Font.PLAIN, (int) 18));

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
        cons.gridwidth = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(textFieldID, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelEnderecoDestino, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(comboBoxEnderecoDestino, cons);

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
        panelFormulario.add(labelRedespacho, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 3;
        cons.gridwidth = 1;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(comboBoxRedespacho, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 4;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(labelVolume, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 4;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.ipadx = 200;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(comboBoxVolume, cons);

        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 5;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(buttonAdicionarVolume, cons);

        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 6;
        cons.insets = new Insets(5, 0, 5, 0);
        cons.ipadx = 350;
        cons.ipady = 200;
        cons.gridwidth = 2;
        cons.fill = GridBagConstraints.HORIZONTAL;
        panelFormulario.add(new JScrollPane(tabelaVolumes), cons);

        super.addFormulario(panelFormulario);
    }
}
