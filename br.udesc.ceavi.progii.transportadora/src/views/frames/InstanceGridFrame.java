/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.frames;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author André Cristen
 * Deve ser usado para intancia de novos frames em aberturas de telas
 * que contenham Grids internos mas nao contenham actions
 */
public class InstanceGridFrame extends AbstractGridFrame{
    
    public InstanceGridFrame(List<Object> objetos, String title, AbstractTableModel tableAppend) {
        super(objetos, title, tableAppend);
    }
    
}
