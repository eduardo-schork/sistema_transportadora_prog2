/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.grids;

import java.util.List;
import models.Filial;

/**
 *
 * @author André Cristen
 */
public class FilialGrid extends AbstractGrid{

    public FilialGrid(List<Object> linhas, String[] colunas) {
        super(linhas, colunas);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Filial filial = (Filial)super.getLinhas().get(rowIndex);

        switch (columnIndex) {
            case 0:
                return filial.getId();
            case 1:
                return filial.getEndereco().getId();
            case 2:
                return filial.getNome();
            default:
                return null;
        }
    }
    
}
