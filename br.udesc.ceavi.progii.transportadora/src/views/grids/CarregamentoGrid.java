/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.grids;

import java.util.List;
import models.Carregamento;
import models.Veiculo;

/**
 *
 * @author André Cristen
 */
public class CarregamentoGrid extends AbstractGrid{

    public CarregamentoGrid(List<Object> linhas, String[] colunas) {
        super(linhas, colunas);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      Carregamento carregamento = (Carregamento)super.getLinhas().get(rowIndex);

        switch (columnIndex) {
            case 0:
                return carregamento.getId();
            case 1:
                return carregamento.getEnderecoChegada();
            case 2:
                return carregamento.getEnderecoSaida();
            default:
                return null;
        }
    }
    
}
