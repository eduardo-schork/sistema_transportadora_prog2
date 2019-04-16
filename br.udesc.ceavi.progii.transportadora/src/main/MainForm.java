package main;

import views.frames.FormFilial;
import javax.swing.JFrame;
import views.frames.FormCarregamento;
import views.frames.FormTrackingEntrega;
import views.frames.FormTrakingCarregamento;

public class MainForm implements Runnable {

    public static void main(String[] args) {
        MainForm tela = new MainForm();
        Thread thread = new Thread(tela);

        thread.start();
    }

    @Override
    public void run() {
        JFrame frame = new FormTrakingCarregamento();
        
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
