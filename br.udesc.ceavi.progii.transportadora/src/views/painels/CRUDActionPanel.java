package views.painels;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Esta classe define o painel para as funcionalidades CRUD para o sistema
 *
 * @author Márcio José Mantau
 * @version 1.0
 * @since 12/03/2018
 */
public class CRUDActionPanel extends JPanel {
    private JButton btCancelar;
    private JButton btNovo;
    private JButton btGravar;
    private JButton btExcluir;

    private LayoutManager layout;

    private Dimension dimensaoBotao;
    private Dimension dimensaoPainel;
    
    private Container parent;

    public CRUDActionPanel(Container parent) {
        this.parent = parent;
        
        initComponents();
        addComponents();

        super.setVisible(true);
        super.setSize(dimensaoPainel);
    }

    private void initComponents() {
        dimensaoBotao = new Dimension(100,20);
        dimensaoPainel = new Dimension(parent.getWidth(), 30);
        
        layout = new FlowLayout(FlowLayout.CENTER);

        btCancelar = new JButton("Cancelar");
        btCancelar.setSize(dimensaoBotao);

        btNovo = new JButton("Novo");
        btNovo.setSize(dimensaoBotao);

        btGravar = new JButton("Gravar");
        btGravar.setSize(dimensaoBotao);

        btExcluir = new JButton("Excluir");
        btExcluir.setSize(dimensaoBotao);
    }

    private void addComponents() {
        this.setLayout(layout);
        this.add(btCancelar);
        this.add(btNovo);
        this.add(btExcluir);
        this.add(btGravar);
    }

    public JButton getBtCancelar() {
        return btCancelar;
    }

    public JButton getBtNovo() {
        return btNovo;
    }

    public JButton getBtGravar() {
        return btGravar;
    }

    public JButton getBtExcluir() {
        return btExcluir;
    }
        
}