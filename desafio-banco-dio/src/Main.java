// Estrutura onde vai rodar as informações do projeto
// Quando chama o construtor da Conta a ContaCorrente vai gerar conta e numero

public class Main {

	public static void main(String[] args) {
		
		Cliente safira = new Cliente();
		safira.setNome("Safira");
		
		Conta cc = new ContaCorrente(safira);
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(safira);
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	
		
	}
		

}
