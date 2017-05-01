import com.senac.SimpleJava.Console;

public class circuloTeste {
	
	
	Circulo c1 = new Circulo();
	Circulo c2 = new Circulo();
	double distCentro;
   
	public void run() {
    	    	
    	c1.construtor();
    	Console.println("\n�rea do circulo: "+c1.calcularArea()
		+" \nCircunfer�ncia do circulo: " +c1.calcularCircunferencia());
    	
    	c2.construtor();
    	Console.println("\n�rea do circulo: "+c2.calcularArea()
		+" \nCircunfer�ncia do circulo: " +c2.calcularCircunferencia());
    	
    	Console.println("\nInforme a dist�ncia entre o centro dos circulos: ");
    	distCentro=Console.readDouble();
    	
    	verificarEstado();
   
    	  }

public void verificarEstado(){
	
	if(distCentro>c1.getRaio()+c2.getRaio()){
		Console.println("\nOs c�rculos est�o afastados! ");
	}else if(distCentro==c1.getRaio()+c2.getRaio()){
		Console.println("\nOs c�rculos est�o encostados! ");
	}else if(distCentro<c1.getRaio()+c2.getRaio() && distCentro!=0){
		Console.println("\nOs c�rculos colidiram! ");
	}else if(distCentro==0){
		Console.println("\nOs c�rculos est�o sobrepostos! ");
	}
		
		
}
}




	
/*1) Implemente uma classe que representa um c�rculo, esta classe deve permitir
 calcular a �rea do c�rculo, a sua circunfer�ncia, e permitir verificar se dois objetos
  "c�rculo" est�o em contato um com o outro.*/
