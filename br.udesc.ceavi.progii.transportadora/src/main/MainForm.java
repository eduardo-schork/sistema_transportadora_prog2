package main;

import views.frames.FormFilial;
import javax.swing.JFrame;
import views.frames.FormCarregamento;
import views.frames.FormEndereco;
import views.frames.FormEntrega;
import views.frames.FormPessoaFisica;
import views.frames.FormPessoaJuridica;
import views.frames.FormTrackingEntrega;
import views.frames.FormTrakingCarregamento;
import views.frames.FormTransRedespacho;
import views.frames.FormUsuario;
import views.frames.FormVeiculo;
import views.frames.FormVolume;

public class MainForm implements Runnable {

    public static void main(String[] args) {
        MainForm tela = new MainForm();
        Thread thread = new Thread(tela);

        thread.start();
    }

    @Override
    public void run() {
        JFrame frame = new FormVolume();

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
