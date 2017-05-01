import com.senac.SimpleJava.Console;

public class Circulo {

	private double Raio;
	private double Circunferencia;
	private double Area;

	void construtor(){
        
	 Console.print("Informe o valor do raio do círculo: ");
	 Raio=Console.readDouble();
      
    }

public double getRaio() {
		return Raio;
	}

	public double getCircunferencia() {
		return Circunferencia;
	}

	
double calcularArea (){
    
	Area= Math.PI*Raio*Raio;
	return Area;
}

double calcularCircunferencia (){
    
   Circunferencia = 2*Math.PI*Raio;
    
    return Circunferencia;
}





}	
