package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente jose = new Cliente();
		jose.setNome("jose");
		
		Conta cc = new ContaCorrente(jose);
		cc.depositar(100.0);
		
		Conta cp = new ContaPoupanca(jose);
		
		cc.transferir(cp, 100);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
