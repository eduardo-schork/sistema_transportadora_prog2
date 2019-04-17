package views.painels;

import controllers.BaseController;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FormPanel extends JPanel {

    private JButton buttonSalvar;
    private JButton buttonCancelar;
    private LayoutManager layout;
    private Dimension dimensaoBotao;
    private Dimension dimensaoPanel;
    private Container parent;

    public FormPanel(Container parent, BaseController controller) {
        super();
        this.parent = parent;

        initComponents(controller);

        addComponents();

    }

    private void initComponents(BaseController controller) {
        dimensaoBotao = new Dimension(100, 20);
        dimensaoPanel = new Dimension(parent.getWidth(), 30);
        this.setSize(dimensaoPanel);

        buttonSalvar = new JButton("Salvar");
        buttonSalvar.setSize(dimensaoBotao);
        buttonSalvar.addActionListener((e) -> {
            //Chama a acao com base no action
            //deve ser ou addPost ou editPost
            controller.editObject();
        });

        buttonCancelar = new JButton("Cancelar");
        buttonCancelar.setSize(dimensaoBotao);
        layout = new FlowLayout(FlowLayout.RIGHT);
    }

    private void addComponents() {
        this.setLayout(layout);
        this.add(buttonCancelar);
        this.add(buttonSalvar);

    }
}
