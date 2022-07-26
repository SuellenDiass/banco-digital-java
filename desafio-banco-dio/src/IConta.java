// Classe interface é uma classe abstrata com todos metodos abstratos
// Todo metodo da interface é publico
//Interface define as operações a ser utilizadas

public interface IConta {

	 void sacar(double valor);
		
	 void depositar(double valor);
	
	 void transferir(double valor, Conta contaDestino);
	 
	 void imprimirExtrato();
	 
		
}
