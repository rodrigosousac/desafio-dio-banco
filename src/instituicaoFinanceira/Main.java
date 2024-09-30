package instituicaoFinanceira;

public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco();
		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		banco.adicionarConta(cc);
		
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(venilton);
		banco.adicionarConta(poupanca);
		
		cc.transferir(100, poupanca);
		
		//cc.imprimirExtrato();
		//poupanca.imprimirExtrato();
		System.out.println("Antes da cobrança de taxa:");
		banco.exibirContas();
		
		banco.cobrarTaxaManutencaoTodasContas();
		
		System.out.println("\nApós a cobrança de taxa:");
		banco.exibirContas();
		
		
	}
}
