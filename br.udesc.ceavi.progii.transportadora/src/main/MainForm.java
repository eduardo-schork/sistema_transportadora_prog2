package main;

import views.frames.FormFilial;
import javax.swing.JFrame;

public class MainForm implements Runnable {

    public static void main(String[] args) {
        MainForm tela = new MainForm();
        Thread thread = new Thread(tela);

        thread.start();
    }

    @Override
    public void run() {
        JFrame frame = new FormFilial();
        
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
