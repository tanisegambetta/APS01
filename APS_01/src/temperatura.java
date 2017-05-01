import com.senac.SimpleJava.Console;

public class temperatura {

	double convertido;
	String temperatura="";
	String letra;
	char invalido;
	
	
	public void run() {
		
		
		Console.println("Digite a temperatura: ");
		 temperatura = Console.readLine().toUpperCase();
		
		 while((tipotemp(temperatura)!='C') && (tipotemp(temperatura)!='F')){
		 
		 Console.println("Valor inválido!");
		 Console.println("Digite a temperatura acrescentando C para Celsius ou F para Fahrenheit: ");
		 temperatura = Console.readLine().toUpperCase();
		}
	
		  if(tipotemp(temperatura)=='C'){
			 letra = "F";
		 	}else if(tipotemp(temperatura)=='F'){
			 letra = "C";
		 }
		 Console.println(converte()+"º"+letra);
		 }
	
	public char tipotemp (String temperatura){
				    if (temperatura != null && temperatura.length() > 0) {
			        return temperatura.charAt(temperatura.length() - 1);
			    }
			    return  invalido;
			}
		
		public String verificaDigito() {
		    char[] c = temperatura.toCharArray();
		    String digito ="";
		    String digires="";
		    for ( int i = 0; i < c.length; i++ )
		           if ( Character.isDigit( c[ i ] ) ) {
		            
		            digito = Character.toString(c[i]);   
		            digires = digires+digito;
		                
		           }
		    return digires;
			
		        }
		
		    
	public double converte(){
	char letrac= 'C';
	char letraf= 'F';
	int valor = 0;
	valor = Integer.parseInt(verificaDigito());
	
	if(tipotemp(temperatura)==(letrac)){
		convertido = (valor*1.8)+32;

		}else if(tipotemp(temperatura)==(letraf)){
			convertido=(valor-32)/1.8;
}
	return convertido;
		
	}
}

/*4) Crie uma classe que representa a temperatura, onde o usuário da classe pode converter a temperatura
 *  em graus Celsius ou Farenheit. Crie também um método nesta classe que receba uma string,
 *   como "23C" ou "45F" e ajuste corretamente a temperatura.
 */