/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.grids;

import controllers.EnderecoController;
import java.util.ArrayList;
import java.util.List;
import models.Endereco;

/**
 *
 * @author 09046167976
 */
public class EnderecoGrid extends AbstractGrid{

    public EnderecoGrid(List<Object> linhas, String[] colunas) {
        super(linhas, colunas);
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        Endereco endereco = (Endereco)super.getLinhas().get(rowIndex);

        switch (columnIndex) {
            case 0:
                return endereco.getId();
            case 1:
                return endereco.getBairro();
            case 2:
                return endereco.getCep();
            case 3:
                return endereco.getCidade();
            default:
                return null;
        }
    }
    
}
