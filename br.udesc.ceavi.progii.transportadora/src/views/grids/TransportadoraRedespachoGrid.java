/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.grids;

import java.util.List;
import models.Carregamento;
import models.Pessoa;
import models.TransportadoraRedespacho;
import models.Veiculo;

/**
 *
 * @author Lucas Dolsan
 */
public class TransportadoraRedespachoGrid extends AbstractGrid{

    public TransportadoraRedespachoGrid(List<Object> linhas, String[] colunas) {
        super(linhas, colunas);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      TransportadoraRedespacho transRedespacho = (TransportadoraRedespacho)super.getLinhas().get(rowIndex);

        switch (columnIndex) {
            case 0:
                return transRedespacho.getId();
            case 1:
                return transRedespacho.getPessoaJuridica();
            default:
                return null;
        }
    }
    
}
