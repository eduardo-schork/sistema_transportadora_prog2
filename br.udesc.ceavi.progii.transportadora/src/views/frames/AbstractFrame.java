/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.frames;

import java.util.List;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author T-Gamer
 */
public abstract class AbstractFrame extends JFrame {

    private JTable tableObjetos;
    private JScrollPane scrollTable;

    private List<Object> objetos;

    public AbstractFrame(List<Object> objetos, String title, AbstractTableModel tableAppend) {
        super(title);

        this.objetos = objetos;

        initialize(tableAppend);
        addComponents();

        super.setSize(800, 600);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initialize(AbstractTableModel tableModel) {
        tableObjetos = new JTable(tableModel);
        scrollTable = new JScrollPane(tableObjetos);
    }

    private void addComponents() {
        this.getContentPane().add(scrollTable);
    }

}
