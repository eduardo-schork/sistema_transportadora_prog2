/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.grids;

import java.util.List;
import models.Carregamento;
import models.Pessoa;
import models.Veiculo;

/**
 *
 * @author André Cristen
 */
public class PessoaGrid extends AbstractGrid{

    public PessoaGrid(List<Object> linhas, String[] colunas) {
        super(linhas, colunas);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      Pessoa pessoa = (Pessoa)super.getLinhas().get(rowIndex);

        switch (columnIndex) {
            case 0:
                return pessoa.getId();
            case 1:
                return pessoa.getNome();
            case 2:
                return pessoa.getSobrenome();
            default:
                return null;
        }
    }
    
}
