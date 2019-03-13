import java.sql.Date;
import java.util.ArrayList;

public class Entregas {
	private int id;
	
	private Date dataSaida;
	
	private Date dataPrevisaoEntrega;
	
	private Date dataEfetivaEntrega;
	
	private Endereco enderecoDestino;
	
	private Endereco enderecoSaida;
	
	private Veiculo veiculo;
	
	private StatusEntrega status;
	
	private ArrayList<Volume> volumes;
}
