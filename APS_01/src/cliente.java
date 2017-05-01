import com.senac.SimpleJava.Console;

public class cliente {
 
 String numero;
 String agencia;
 double saldo=150;
 double valorsolicitado;
 double valordepositado;
 
 void entradaSaque(){
     
	 Console.println("Informe o valor do saque: ");
	 valorsolicitado=Console.readDouble();
 }
 
void entradaDeposito(){
     
	 Console.println("Informe o valor do depósito: ");
	 valordepositado=Console.readDouble();
 }

public boolean sacar(){
	saldo = 150;

	//com saldo
	if(saldo>=valorsolicitado){
	saldo=saldo-valorsolicitado;
		return true;

	//saldo insuficiente
	}else {
			return false;
	}
}
	public boolean depositar(){
		saldo=150;
		if(valordepositado<=0){
			return false;
		
		}else{
		saldo=valordepositado+saldo;
		}
		return true ;
			
	}
}
	
	
	

