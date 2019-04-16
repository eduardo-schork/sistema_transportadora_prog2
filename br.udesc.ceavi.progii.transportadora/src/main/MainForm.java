package main;

import views.forms.FormFilial;
import javax.swing.JFrame;
import views.forms.FormCarregamento;
import views.forms.FormEndereco;
import views.forms.FormEntrega;
import views.forms.FormPessoaFisica;
import views.forms.FormPessoaJuridica;
import views.forms.FormTrackingEntrega;
import views.forms.FormTrakingCarregamento;
import views.forms.FormTransRedespacho;
import views.forms.FormUsuario;
import views.forms.FormVeiculo;
import views.forms.FormVolume;

public class MainForm implements Runnable {

//    public static void main(String[] args) {
//        MainForm tela = new MainForm();
//        Thread thread = new Thread(tela);
//
//        thread.start();
//    }

    @Override
    public void run() {
        JFrame frame = new FormVolume();

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
