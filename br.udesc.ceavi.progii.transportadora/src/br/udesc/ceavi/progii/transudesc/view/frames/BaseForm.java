package br.udesc.ceavi.progii.transudesc.view.frames;

import br.udesc.ceavi.progii.transudesc.view.panels.FormPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BaseForm extends JFrame{

   private JPanel basePanel;
    private JPanel panelCRUD;
    private LayoutManager layout;
    private Dimension dimensao;

    public BaseForm(String titulo, Dimension dimensao) {
        super(titulo);
        
        this.dimensao = dimensao;
        
        initComponents();
        addComponents();
    }

    private void initComponents() {
        basePanel = new JPanel();
        this.setSize(dimensao);
        
        panelCRUD = new FormPanel(this);
        
        layout = new BorderLayout();
        basePanel.setLayout(layout);
    }

    private void addComponents() {
        this.setContentPane(basePanel);
        basePanel.add(panelCRUD, BorderLayout.SOUTH);
    }
    
    public void addFormulario(Container container){
        basePanel.add(container, BorderLayout.CENTER);
    }

}

