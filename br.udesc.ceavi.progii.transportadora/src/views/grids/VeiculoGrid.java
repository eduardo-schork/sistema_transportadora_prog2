/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.grids;

import java.util.List;
import models.Veiculo;

/**
 *
 * @author André Cristen
 */
public class VeiculoGrid extends AbstractGrid{

    public VeiculoGrid(List<Object> linhas, String[] colunas) {
        super(linhas, colunas);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      Veiculo veiculo = (Veiculo)super.getLinhas().get(rowIndex);

        switch (columnIndex) {
            case 0:
                return veiculo.getId();
            case 1:
                return veiculo.getDataAquisicao();
            case 2:
                return veiculo.getPlaca();
            case 3:
                return veiculo.getStatus();
            case 4:
                return veiculo.getTipo();
            default:
                return null;
        }
    }
    
}
