package banco_LucasSantos_MarcelaCaram_SulamitaCosta_ViniciusPinheiro;

public class ContaPoupanca extends ContaBancaria{
	
	public ContaPoupanca() {
		super();
	}
	public ContaPoupanca(String nome, int numConta, double saldo) {
		super(nome, numConta, saldo);
	}

	@Override
	public String getNome() {
		return super.getNome();
	}
	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}
	@Override
	public int getNumConta() {
		return super.getNumConta();
	}
	@Override
	public void setNumConta(int numConta) {
		super.setNumConta(numConta);
	}
	@Override
	public double getSaldo() {
		return super.getSaldo();
	}
	@Override
	public void setSaldo(double saldo) {
		super.setSaldo(saldo);
	}
	
	@Override
	public boolean sacar(double saque) {
		if(saque <= super.saldo) {
			super.saldo -= saque;
			return true;
		}
		
		else {
			return false;
		}
	}
	
	@Override
	public void depositar(double deposito) {
		super.depositar(deposito);
	}
}
