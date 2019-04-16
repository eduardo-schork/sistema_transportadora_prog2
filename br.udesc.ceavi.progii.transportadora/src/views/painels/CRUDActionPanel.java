package views.painels;

import controllers.BaseController;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Esta classe define o painel para as funcionalidades CRUD para o sistema
 *
 * @author Lucas Levi Gonçalves
 * @since 08/04/2018
 */
public class CRUDActionPanel extends JPanel {
    private JButton btVisualizar;
    private JButton btNovo;
    private JButton btEditar;
    private JButton btExcluir;

    private LayoutManager layout;

    private Dimension dimensaoBotao;
    private Dimension dimensaoPainel;
    
    private Container parent;

    public CRUDActionPanel(Container parent, BaseController controller) {
        this.parent = parent;
        
        initComponents(controller);
        addComponents();

        super.setVisible(true);
        super.setSize(dimensaoPainel);
    }

    private void initComponents(BaseController controller) {
        dimensaoBotao = new Dimension(100,20);
        dimensaoPainel = new Dimension(parent.getWidth(), 30);
        
        layout = new FlowLayout(FlowLayout.CENTER);

        btNovo = new JButton("Adicionar");
        btNovo.setSize(dimensaoBotao);
        btNovo.addActionListener((e) -> {
            controller.add();
        });

        btEditar = new JButton("Editar");
        btEditar.setSize(dimensaoBotao);
        btEditar.addActionListener((e) -> {
            controller.edit();
        });
        btVisualizar = new JButton("Visualizar");
        btVisualizar.setSize(dimensaoBotao);
        btVisualizar.addActionListener((e) -> {
            controller.view();
        });

        btExcluir = new JButton("Excluir");
        btExcluir.setSize(dimensaoBotao);
        btExcluir.addActionListener((e) -> {
            controller.delete();
        });
    }

    private void addComponents() {
        this.setLayout(layout);
        this.add(btNovo);
        this.add(btEditar);
        this.add(btVisualizar);
        this.add(btExcluir);
    }

    public JButton getBtCancelar() {
        return btVisualizar;
    }

    public JButton getBtNovo() {
        return btNovo;
    }

    public JButton getBtGravar() {
        return btEditar;
    }

    public JButton getBtExcluir() {
        return btExcluir;
    }
        
}