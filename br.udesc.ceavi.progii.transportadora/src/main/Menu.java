package main;

import controllers.VeiculoController;
import controllers.CarregamentoController;
import controllers.UsuarioController;
import controllers.VolumeController;
import controllers.EntregaController;
import controllers.FilialController;
import controllers.TransportadoraRedespachoController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import models.Carregamento;
import models.Endereco;
import models.Entrega;
import models.Filial;
import models.Pessoa;
import models.Usuario;
import models.TransportadoraRedespacho;
import models.Veiculo;
import models.Volume;
import views.frames.InstanceGridActionsFrame;
import views.frames.InstanceGridFrame;
import views.grids.CarregamentoGrid;
import views.grids.EntregaGrid;
import views.grids.FilialGrid;
import views.grids.PessoaGrid;
import views.grids.TransportadoraRedespachoGrid;
import views.grids.VeiculoGrid;
import views.grids.VolumeGrid;
import views.grids.UsuarioGrid;

/**
 *
 * @author Lucas Levi Gonçalves
 */

public class Menu extends JFrame {

    public Menu() {

        setTitle("TransUdesc - Sistema");
        setSize(1920, 1080);

        // Cria uma barra de menu para o JFrame
        JMenuBar menuBar = new JMenuBar();

//         Adiciona a barra de menu ao  frame
        setJMenuBar(menuBar);

        JMenu crud_menu = new JMenu("CRUD");
        JMenu relatorios_menu = new JMenu("Relatórios");
        JMenu consulta_adm_menu = new JMenu("Consultas - Administrador");
        JMenu verif_veiculos_menu = new JMenu("Verificar veículos");
        JMenu cargas_menu = new JMenu("Cargas");
        JMenu consulta_entrega_menu = new JMenu("Consultar Entregas");
        JMenu estatisticas_menu = new JMenu("Estatísticas");
        
//      Coloca na barra de menu
        menuBar.add(estatisticas_menu);
        menuBar.add(crud_menu);
        menuBar.add(consulta_adm_menu);
        menuBar.add(verif_veiculos_menu);
        menuBar.add(cargas_menu);
        menuBar.add(relatorios_menu);
        menuBar.add(consulta_entrega_menu);
         
        // Cria e adiciona um item para o menu
        JMenuItem carregamento = new JMenuItem("Carregamento");

        carregamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent action) {
                List<Carregamento> carregamentos = new ArrayList<>();
                for (int i = 1; i <= 15; i++) {
                    Carregamento carregamento = new Carregamento();
                    Endereco endereco = new Endereco();
                    carregamento.setId(i);
                    carregamento.setEnderecoChegada(endereco);
                    carregamento.setEnderecoSaida(endereco);
                    carregamentos.add(carregamento);
                }
                String[] colunasCarregamentos;
                colunasCarregamentos = new String[]{"#", "Endereço chegada", "Endereço saída"};
                CarregamentoGrid carregamentoGrid = new CarregamentoGrid((List)carregamentos, colunasCarregamentos);
                CarregamentoController controller = new CarregamentoController();
                JFrame frameCarregamento = new InstanceGridActionsFrame(controller, "Carregamentos", carregamentoGrid );
                
                frameCarregamento.setResizable(false);
                frameCarregamento.setLocationRelativeTo(null);
                frameCarregamento.setVisible(true);
            }
        });

        JMenuItem entrega_crud = new JMenuItem("Entrega");

        entrega_crud.addActionListener((action) -> {

        });
            //abaixo são adicionados todos os itens do menu e seus respectivos
            //listeners para clique com suas ações a serem executadas
        JMenuItem filial = new JMenuItem("Filial");

        filial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent action) {
                List<Filial> filiais = new ArrayList<>();
                //adicionamento de informação de placeholder, só pra mostrar como fica
                for (int i = 1; i <= 15; i++) {
                    Filial filial = new Filial();
                    filial.setId(i);
                    filial.setEndereco(new Endereco());
                    filial.setNome("Junior trans "+ i);
                    filiais.add(filial);
                }
                String[] colunasFiliais;
                colunasFiliais = new String[]{"#", "Endereço", "Nome"};
                FilialGrid pessoaGrid = new FilialGrid((List)filiais, colunasFiliais);
                FilialController controller = new FilialController();
                JFrame frameCarregamento = new InstanceGridActionsFrame(controller, "Filiais", pessoaGrid );
                
                frameCarregamento.setResizable(false);
                frameCarregamento.setLocationRelativeTo(null);
                frameCarregamento.setVisible(true);
            }
        });

        JMenuItem pessoa = new JMenuItem("Pessoa");

        pessoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent action) {
                List<Pessoa> pessoas = new ArrayList<>();
                //mesmo esquema, só pra ver como fica...
                for (int i = 1; i <= 15; i++) {
                    Pessoa pessoa = new Pessoa();
                    pessoa.setId(i);
                    pessoa.setNome("Zé número: " + i);
                    pessoa.setSobrenome("Da silva "+ i);
                    pessoas.add(pessoa);
                }
                String[] colunasPessoas;
                colunasPessoas = new String[]{"#", "Endereço chegada", "Endereço saída"};
                PessoaGrid pessoaGrid = new PessoaGrid((List)pessoas, colunasPessoas);
                CarregamentoController controller = new CarregamentoController();
                JFrame frameCarregamento = new InstanceGridActionsFrame(controller, "Pessoas", pessoaGrid );
                
                frameCarregamento.setResizable(false);
                frameCarregamento.setLocationRelativeTo(null);
                frameCarregamento.setVisible(true);
            }
        });
              
        JMenuItem usuario = new JMenuItem("Usuário");

        usuario.addActionListener((action) -> {
            usuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent action) {
                List<Usuario> usuario = new ArrayList<>();
                String[] colunasUsuarios;
                colunasUsuarios = new String[]{"#", "Pessoa", "Login"};
                UsuarioGrid usuarioGrid = new UsuarioGrid((List)usuario, colunasUsuarios);
                UsuarioController controller = new UsuarioController();
                JFrame frameCarregamento = new InstanceGridActionsFrame(controller, "Usuário", usuarioGrid );

                frameCarregamento.setResizable(false);
                frameCarregamento.setLocationRelativeTo(null);
                frameCarregamento.setVisible(true);
            }
        }); 
        });

        JMenuItem veiculo = new JMenuItem("Veiculo");

        veiculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent action) {
                List<Veiculo> veiculos = new ArrayList<>();
                for (int i = 1; i <= 15; i++) {
                    Veiculo veiculo = new Veiculo();
                    veiculo.setId(i);
                    veiculo.setPlaca("PLACA-" + i);
                    //veiculo.setStatus(10*3+i);
                    //veiculo.setTipo(i * 10);
                    veiculos.add(veiculo);
                }
                String[] colunasVeiculos;
                colunasVeiculos = new String[]{"#", "Aquisição", "Placa", "Status", "Tipo"};
                VeiculoGrid veiculoGrid = new VeiculoGrid((List)veiculos, colunasVeiculos);
                VeiculoController controller = new VeiculoController();
                JFrame frameVeiculo = new InstanceGridActionsFrame(controller, "Veiculos", veiculoGrid );
                
                frameVeiculo.setResizable(false);
                frameVeiculo.setLocationRelativeTo(null);
                frameVeiculo.setVisible(true);
            }
        });

        JMenuItem volume = new JMenuItem("Volume");

        volume.addActionListener((action) -> {
            volume.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent action) {
                List<Volume> volume = new ArrayList<>();
                String[] colunasVolumes;
                colunasVolumes = new String[]{"#", "Peso Líquido", "Peso Bruto", "Cubagem"};
                VolumeGrid volumeGrid = new VolumeGrid((List)volume, colunasVolumes);
                VolumeController controller = new VolumeController();
                JFrame frameCarregamento = new InstanceGridActionsFrame(controller, "Volume", volumeGrid );

                frameCarregamento.setResizable(false);
                frameCarregamento.setLocationRelativeTo(null);
                frameCarregamento.setVisible(true);
            }
        });    

        });

        JMenuItem clientes = new JMenuItem("Clientes");

        clientes.addActionListener((action) -> {
                
        });

        JMenuItem consulta_veiculos = new JMenuItem("Veiculos");

        consulta_veiculos.addActionListener((action) -> {

        });

        JMenuItem motoristas = new JMenuItem("Motoristas");

        motoristas.addActionListener((action) -> {

        });

        JMenuItem entregas = new JMenuItem("Entregas");

        entregas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent action) {
               List<Entrega> entregas = new ArrayList<>();
                for (int i = 1; i <= 15; i++) {
                    Entrega entrega = new Entrega();
                    entrega.setId(i);
                    entrega.setEnderecoDestino(new Endereco());
//                    entrega.setRedespacho(new TransportadoraRedespacho());
                    entregas.add(entrega);
                }
                String[] colunasEntregas;
                colunasEntregas = new String[]{"#", "Endereco Destino", "Transportadora Redes."};
                EntregaGrid entregaGrid = new EntregaGrid((List)entregas, colunasEntregas);
                EntregaController controller = new EntregaController();
                JFrame frameEntrega = new InstanceGridActionsFrame(controller, "Entregas", entregaGrid );
                
                frameEntrega.setResizable(false);
                frameEntrega.setLocationRelativeTo(null);
                frameEntrega.setVisible(true);
            }
        });
       
        JMenuItem volumes = new JMenuItem("Volumes");

        volumes.addActionListener((action) -> {

        });

        JMenuItem entrega_consult = new JMenuItem("Consultar entrega");

        entrega_consult.addActionListener((action) -> {

        });

        JMenuItem transportadora = new JMenuItem("Trasportadora Redespacho");

        transportadora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent action) {
                List<TransportadoraRedespacho> transRedespacho = new ArrayList<>();
                String[] colunasTransRedespacho;
                colunasTransRedespacho = new String[]{"#", "Pessoa Jurídica"};
                TransportadoraRedespachoGrid transResGrid = new TransportadoraRedespachoGrid((List)transRedespacho, colunasTransRedespacho);
                TransportadoraRedespachoController controller = new TransportadoraRedespachoController();
                JFrame frameRedespacho = new InstanceGridActionsFrame(controller, "Transportadoras Redespacho", transResGrid );
                
                frameRedespacho.setResizable(false);
                frameRedespacho.setLocationRelativeTo(null);
                frameRedespacho.setVisible(true);
            }
        });

        JMenuItem veiculos_verif_em_reparo = new JMenuItem("Veículos em reparo");
        JMenuItem veiculos_verif_aguard_reparo = new JMenuItem("Veículos aguardando reparo");
        
        
        JMenuItem estatisticas_graficos = new JMenuItem("Gráficos");
        JMenuItem estatisticas_contadores = new JMenuItem("Contadores");
        
        
     
        
        
        ButtonGroup bg = new ButtonGroup();
        crud_menu.add(carregamento);
        crud_menu.add(entrega_crud);
        crud_menu.add(filial);
        crud_menu.add(pessoa);
        crud_menu.add(usuario);
        crud_menu.add(veiculo);
        crud_menu.add(volume);
        crud_menu.add(transportadora);

        verif_veiculos_menu.add(veiculos_verif_em_reparo);
        verif_veiculos_menu.add(veiculos_verif_aguard_reparo);

        consulta_adm_menu.add(clientes);
        consulta_adm_menu.add(consulta_veiculos);
        consulta_adm_menu.add(motoristas);
        consulta_adm_menu.add(entregas);
        consulta_adm_menu.add(volumes);
        
        consulta_entrega_menu.add(entrega_consult);
        
        estatisticas_menu.add(estatisticas_graficos);
        estatisticas_menu.add(estatisticas_contadores);
    }
}
