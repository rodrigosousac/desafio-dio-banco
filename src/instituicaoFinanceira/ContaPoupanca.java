package instituicaoFinanceira;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();

	}

	public void cobrarTaxaManutencao() {
		double taxa = 2;
		this.saldo -= taxa;
		System.out.println(String.format("Taxa de manutenção cobrada: %.2f da conta poupança", taxa));
	}
	
}
