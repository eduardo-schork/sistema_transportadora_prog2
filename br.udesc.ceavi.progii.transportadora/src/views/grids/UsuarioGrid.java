/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.grids;

import java.util.List;
import models.Usuario;

/**
 *
 * @author Lucas Levi Gonçalves
 */
public class UsuarioGrid extends AbstractGrid{

    public UsuarioGrid(List<Object> linhas, String[] colunas) {
        super(linhas, colunas);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      Usuario volume = (Usuario)super.getLinhas().get(rowIndex);

        switch (columnIndex) {
            case 0:
                return volume.getId();
            case 1:
                return volume.getPessoa().getNome();
            case 2:
                return volume.getLogin();
            default:
                return null;
                        }
    }
    
}
