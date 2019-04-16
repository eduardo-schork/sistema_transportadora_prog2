/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.frames;

import controllers.BaseController;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author André Cristen
 * Deve ser usado para intancia de novos frames em aberturas de telas
 * que contenham Grids internos e contem as acoes padroes de CRUD para o modelo.
 */
public class InstanceGridActionsFrame extends AbstractGridFrameActions{
    
    public InstanceGridActionsFrame(BaseController controller, String title, AbstractTableModel tableAppend) {
        super(controller, title, tableAppend);
    }
    
}
