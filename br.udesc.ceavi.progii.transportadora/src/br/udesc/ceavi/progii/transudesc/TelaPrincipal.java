package br.udesc.ceavi.progii.transudesc;

import br.udesc.ceavi.progii.transudesc.view.frames.FormEndereco;
import br.udesc.ceavi.progii.transudesc.view.frames.FormEntrega;
import br.udesc.ceavi.progii.transudesc.view.frames.FormPessoaFisica;
import br.udesc.ceavi.progii.transudesc.view.frames.FormPessoaJuridica;
import br.udesc.ceavi.progii.transudesc.view.frames.FormTransRedespacho;
import br.udesc.ceavi.progii.transudesc.view.frames.FormUsuario;
import br.udesc.ceavi.progii.transudesc.view.frames.FormVeiculo;
import br.udesc.ceavi.progii.transudesc.view.frames.FormVolume;
import javax.swing.JFrame;

public class TelaPrincipal implements Runnable {

    public static void main(String[] args) {
        TelaPrincipal tela = new TelaPrincipal();
        Thread thread = new Thread(tela);

        thread.start();
    }

    @Override
    public void run() {
        JFrame frame = new FormEntrega();

        frame.setVisible(true);
    }
}
