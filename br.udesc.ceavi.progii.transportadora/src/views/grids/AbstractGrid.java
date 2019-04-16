/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.grids;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author André Cristen
 * @since 02.04.2019
 */
public abstract class AbstractGrid extends AbstractTableModel{
    private List<Object> linhas;
    private String[] colunas;

    public AbstractGrid(List<Object> linhas, String[] colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
    }
    
     public void limparTabela() {
        linhas.clear();
        super.fireTableDataChanged();
    }
     
      @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    public List<Object> getLinhas() {
        return linhas;
    }

    public void setLinhas(List<Object> linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    
}
