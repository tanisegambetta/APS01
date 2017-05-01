

import com.senac.SimpleJava.Console;

public class contaBancaria {

	cliente conta = new cliente();
	
		public void run() {
	
			conta.numero="1234";
			conta.agencia="56";
			
			
			Console.println("Conta: " +conta.numero+"\nagência: "+conta.agencia+"\nSaldo: R$ "+conta.saldo);
	
			Console.println("Escolha a operação: (1) Saque - (2) Depósito ");
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
			Console.println("Depósito efetuado com sucesso! "+"\nSaldo: "+conta.saldo);
					break;
	}
			else{
		Console.println("Depósito não realizado! "+"\nSaldo: "+conta.saldo);
		
			}//else
			}//switch
		}//main
}//classe
			

/*2) Crie uma classe que representa uma Conta Bancária, esta conta bancária deve permitir saques e depósitos.
 *  Os saques só podem ser efetuados se houver saldo suficiente.
 *  Crie também uma classe que representa um Cliente do banco, ao qual a conta bancária deve ser associada.
 */