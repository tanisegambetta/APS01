

import com.senac.SimpleJava.Console;

public class contaBancaria {

	cliente conta = new cliente();
	
		public void run() {
	
			conta.numero="1234";
			conta.agencia="56";
			
			
			Console.println("Conta: " +conta.numero+"\nag�ncia: "+conta.agencia+"\nSaldo: R$ "+conta.saldo);
	
			Console.println("Escolha a opera��o: (1) Saque - (2) Dep�sito ");
			int opcao = Console.readInt();
	
			switch (opcao){
			case 1: conta.entradaSaque();
					conta.sacar();
					if(conta.sacar()==true){
						Console.println("Saque efetuado com sucesso! "+"\nSaldo: "+conta.saldo);
					}else
						Console.println("Saldo insuficiente! "+"\nSaldo: "+conta.saldo);
					break;
			
			case 2: conta.entradaDeposito();
			if(conta.depositar() ==true){
			Console.println("Dep�sito efetuado com sucesso! "+"\nSaldo: "+conta.saldo);
					break;
	}
			else{
		Console.println("Dep�sito n�o realizado! "+"\nSaldo: "+conta.saldo);
		
			}//else
			}//switch
		}//main
}//classe
			

/*2) Crie uma classe que representa uma Conta Banc�ria, esta conta banc�ria deve permitir saques e dep�sitos.
 *  Os saques s� podem ser efetuados se houver saldo suficiente.
 *  Crie tamb�m uma classe que representa um Cliente do banco, ao qual a conta banc�ria deve ser associada.
 */