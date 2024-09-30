package instituicaoFinanceira;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();

	}
	
	public void cobrarTaxaManutencao() {
		double taxa = 10;
		this.saldo -= taxa;
		System.out.println(String.format("Taxa de manutenção cobrada: %.2f da conta corrente", taxa));
	}
	
}
