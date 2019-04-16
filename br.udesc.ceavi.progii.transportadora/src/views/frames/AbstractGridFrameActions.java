/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.frames;

import controllers.BaseController;
import controllers.EnderecoController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.AbstractTableModel;
import views.painels.CRUDActionPanel;

/**
 *
 * @author André Cristen
 */
public class AbstractGridFrameActions extends JFrame{
    /**
     * Table que sera mostrada no Frame
     */
    private JTable tableObjetos;
    /**
     * Scroll para table
     */
    private JPanel scrollActions;
    private JScrollPane scrollTable;
    
    public AbstractGridFrameActions(BaseController controller, String title, AbstractTableModel tableAppend) {
        //Seta o titulo do frame
        super(title);
        //Seta um tamanho para o Frame
        super.setSize(800, 600);
        super.setDefaultCloseOperation(HIDE_ON_CLOSE);
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        super.setLayout(layout);
        //Inicia com a table a ser inserida
        initialize(tableAppend, controller);
        //Adiciona os componets
        addComponents();
    }

    private void initialize(AbstractTableModel tableModel, BaseController controller) {
        tableObjetos = new JTable(tableModel);
        scrollTable = new JScrollPane(tableObjetos);
        CRUDActionPanel crudActions = new CRUDActionPanel(this, controller );
        scrollActions = new JPanel();
        scrollActions.add(crudActions);
    }

    private void addComponents() {
        Container container = this.getContentPane();
        container.add(scrollActions);
        container.add(scrollTable);
    }
}