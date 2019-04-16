/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.grids;

import java.util.List;
import models.Volume;

/**
 *
 * @author Lucas Levi Gonçalves
 */
public class VolumeGrid extends AbstractGrid{

    public VolumeGrid(List<Object> linhas, String[] colunas) {
        super(linhas, colunas);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      Volume volume = (Volume)super.getLinhas().get(rowIndex);

        switch (columnIndex) {
            case 0:
                return volume.getId();
            case 1:
                return volume.getPesoLiquido();
            case 2:
                return volume.getPesoBruto();
            case 3:
                return volume.getCubagem();
            default:
                return null;
                        }
    }
    
}
