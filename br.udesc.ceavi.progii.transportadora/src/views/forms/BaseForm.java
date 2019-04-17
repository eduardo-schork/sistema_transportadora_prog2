package views.forms;

import controllers.BaseController;
import views.painels.FormPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BaseForm extends JFrame {

    private String action;
    private Object objeto;
    private BaseController controller;
    private JPanel basePanel;
    private JPanel formPanel;
    private LayoutManager layout;
    private Dimension dimensao;

    public BaseForm(String titulo, Dimension dimensao, BaseController controller) {
        super(titulo);

        this.dimensao = dimensao;

        initComponents(controller);
        addComponents();
    }

    private void initComponents(BaseController controller) {
        basePanel = new JPanel();
        this.setSize(dimensao);

        formPanel = new FormPanel(this, controller);

        layout = new BorderLayout();
        basePanel.setLayout(layout);
    }

    private void addComponents() {
        this.setContentPane(basePanel);
        basePanel.add(formPanel, BorderLayout.SOUTH);
    }

    public void addFormulario(Container container) {
        basePanel.add(container, BorderLayout.CENTER);
    }
    
    public void run(){
        this.setVisible(true);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public BaseController getController() {
        return controller;
    }

    public void setController(BaseController controller) {
        this.controller = controller;
    }
    
    

}
