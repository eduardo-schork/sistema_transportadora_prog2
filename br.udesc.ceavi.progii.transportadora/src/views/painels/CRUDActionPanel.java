package views.painels;

import controllers.BaseController;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

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

    private JTable tableGrid;
    private LayoutManager layout;

    private Dimension dimensaoBotao;
    private Dimension dimensaoPainel;

    private Container parent;

    public CRUDActionPanel(Container parent, BaseController controller, JTable tableGrid) {
        this.parent = parent;
        this.tableGrid = tableGrid;
        initComponents(controller);
        addComponents();

        super.setVisible(true);
        super.setSize(dimensaoPainel);
    }

    private void initComponents(BaseController controller) {
        dimensaoBotao = new Dimension(100, 20);
        dimensaoPainel = new Dimension(parent.getWidth(), 30);

        layout = new FlowLayout(FlowLayout.CENTER);

        btNovo = new JButton("Adicionar");
        btNovo.setSize(dimensaoBotao);
        btNovo.setIcon(new ImageIcon(Class.class.getResource("/views/icons/addIcon.png")));
        btNovo.addActionListener((e) -> {
            controller.add();
        });

        btEditar = new JButton("Editar");
        btEditar.setSize(dimensaoBotao);
        btEditar.setIcon(new ImageIcon(Class.class.getResource("/views/icons/editIcon.png")));
        btEditar.addActionListener((e) -> {
            int idSelecionada = this.getIdRowTable();
            if (idSelecionada > 0) {
                controller.edit(idSelecionada);
            }
        });
        btVisualizar = new JButton("Visualizar");
        btVisualizar.setSize(dimensaoBotao);
        btVisualizar.setIcon(new ImageIcon(Class.class.getResource("/views/icons/findIcon.png")));
        btVisualizar.addActionListener((e) -> {
            int idSelecionada = this.getIdRowTable();
            if (idSelecionada > 0) {
                controller.view(idSelecionada);
            }
        });

        btExcluir = new JButton("Excluir");
        btExcluir.setSize(dimensaoBotao);
        btExcluir.setIcon(new ImageIcon(Class.class.getResource("/views/icons/removeIcon.png")));
        btExcluir.addActionListener((e) -> {
            int idSelecionada = this.getIdRowTable();
            if (idSelecionada > 0) {
                int reply = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja realmente excluir este registro?", "Atenção!", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    controller.delete(idSelecionada);
                }
            }
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

    /**
     * Retorna o id da linha selecionada para ser usado 
     * para carregar o modelo em questao.
     */
    public int getIdRowTable() {
        int column = 0;
        int row = this.tableGrid.getSelectedRow();
        if (row > 0) {
            String value = this.tableGrid.getModel().getValueAt(row, column).toString();
            return Integer.parseInt(value);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
        return 0;
    }
}
