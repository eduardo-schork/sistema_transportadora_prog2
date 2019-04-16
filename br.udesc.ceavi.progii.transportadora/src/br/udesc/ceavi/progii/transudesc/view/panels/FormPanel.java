package br.udesc.ceavi.progii.transudesc.view.panels;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FormPanel extends JPanel {

    private JButton buttonSalvar;
    private JButton buttonCancelar;

    private LayoutManager layout;

    private Dimension dimensaoBotao;
    private Dimension dimensaoPanel;

    private Container parent;

    public FormPanel(Container parent) {
        super();
        this.parent = parent;

        initComponents();

        addComponents();

    }

    private void initComponents() {
        dimensaoBotao = new Dimension(100, 20);
        dimensaoPanel = new Dimension(parent.getWidth(), 30);
        this.setSize(dimensaoPanel);

        buttonSalvar = new JButton("Salvar");
        buttonSalvar.setSize(dimensaoBotao);

        buttonCancelar = new JButton("Cancelar");
        buttonCancelar.setSize(dimensaoBotao);

        layout = new FlowLayout(FlowLayout.CENTER);
    }

    private void addComponents() {
        this.setLayout(layout);
        this.add(buttonCancelar);
        this.add(buttonSalvar);

    }
}
