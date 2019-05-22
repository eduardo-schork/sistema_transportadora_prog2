/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.grids;

import java.util.List;
import models.Entrega;
import models.Filial;

/**
 *
 * @author André Cristen
 */
public class EntregaGrid extends AbstractGrid{

    public EntregaGrid(List<Object> linhas, String[] colunas) {
        super(linhas, colunas);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Entrega entrega = (Entrega)super.getLinhas().get(rowIndex);

        switch (columnIndex) {
            case 0:
                return entrega.getId();
            case 1:
                return entrega.getEnderecoDestino().getId();
            case 2:
                return entrega.getId();
            default:
                return null;
        }
    }
    
}
