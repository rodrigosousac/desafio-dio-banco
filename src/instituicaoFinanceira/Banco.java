package instituicaoFinanceira;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void exibirContas() {
		for(Conta c : contas) {
			System.out.println("Titular: " + c.cliente.getNome());
			System.out.println("Agência: " + c.getAgencia());
			System.out.println("Número: " + c.getNumero());
			System.out.println("Saldo: " + c.getSaldo());
		}	
	}
	
	public void cobrarTaxaManutencaoTodasContas() {
		for(Conta c : contas) {
			c.cobrarTaxaManutencao();
		}
	}
}
