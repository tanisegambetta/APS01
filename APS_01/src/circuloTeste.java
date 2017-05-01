import com.senac.SimpleJava.Console;

public class circuloTeste {
	
	
	Circulo c1 = new Circulo();
	Circulo c2 = new Circulo();
	double distCentro;
   
	public void run() {
    	    	
    	c1.construtor();
    	Console.println("\nÁrea do circulo: "+c1.calcularArea()
		+" \nCircunferência do circulo: " +c1.calcularCircunferencia());
    	
    	c2.construtor();
    	Console.println("\nÁrea do circulo: "+c2.calcularArea()
		+" \nCircunferência do circulo: " +c2.calcularCircunferencia());
    	
    	Console.println("\nInforme a distância entre o centro dos circulos: ");
    	distCentro=Console.readDouble();
    	
    	verificarEstado();
   
    	  }

public void verificarEstado(){
	
	if(distCentro>c1.getRaio()+c2.getRaio()){
		Console.println("\nOs círculos estão afastados! ");
	}else if(distCentro==c1.getRaio()+c2.getRaio()){
		Console.println("\nOs círculos estão encostados! ");
	}else if(distCentro<c1.getRaio()+c2.getRaio() && distCentro!=0){
		Console.println("\nOs círculos colidiram! ");
	}else if(distCentro==0){
		Console.println("\nOs círculos estão sobrepostos! ");
	}
		
		
}
}




	
/*1) Implemente uma classe que representa um círculo, esta classe deve permitir
 calcular a área do círculo, a sua circunferência, e permitir verificar se dois objetos
  "círculo" estão em contato um com o outro.*/
