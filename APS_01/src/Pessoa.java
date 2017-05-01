import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import com.senac.SimpleJava.Console;

public class Pessoa {
	
	LocalDate dataNasc;
	int idade;
	String Signo;
	
	public void run (){
	formatarData();	
	informaSigno();
	}
	
	public void formatarData(){
		
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String data;
		
		Console.println("Digite sua data de nascimento: ");
		data = Console.readLine();
		dataNasc = LocalDate.parse(data, formatar);
	 //   Console.println(dataNasc);
	    
	    LocalDate dataAtual = LocalDate.now();
	 //   Console.println(dataAtual);
	
	    Period diferenca = Period.between(dataNasc, dataAtual);
	    
	    idade = diferenca.getYears();
	    int  mesesvida = diferenca.getMonths();
	  //  Console.println(diferenca);
	    if(idade==0){
	    	Console.println(idade+ " anos e "+ mesesvida+ " mês(es)");
	    }else{
	    Console.println(idade+" anos");
	}
	}
	
		
public void informaSigno(){

int dia = dataNasc.getDayOfMonth();
int mes = dataNasc.getMonthValue();
//Console.println(mes);
//Console.println(dia);

if((mes==1 && dia>=20)||( mes==2 && dia<=18)){
Signo = "aquario";		
}
else if((mes==2 && dia>=19)||( mes==3 && dia<=20)){
	Signo = "peixes";
}
else if((mes==3 && dia>=21)||( mes==4 && dia<=20)){
	Signo = "áries";
}
else if((mes==4 && dia>=21)||( mes==5 && dia<=20)){
	Signo = "touro";
}
else if((mes==5 && dia>=21)||( mes==6 && dia<=20)){
	Signo = "gêmeos";
}
else if((mes==6 && dia>=21)||( mes==7 && dia<=22)){
	Signo = "câncer";
}
else if((mes==7 && dia>=23)||( mes==8 && dia<=22)){
	Signo = "leão";
}
else if((mes==8 && dia>=23)||( mes==9 && dia<=22)){
	Signo = "virgem";
}
else if((mes==9 && dia>=23)||( mes==10 && dia<=22)){
	Signo = "libra";
}
else if((mes==10 && dia>=23)||( mes==11 && dia<=21)){
	Signo = "escorpião";
}
else if((mes==11 && dia>=22)||( mes==12 && dia<=21)){
	Signo = "sagitário";
}
else if((mes==12 && dia>=22)||( mes==1 && dia<=19)){
	Signo = "capricórnio";
}
Console.println("Seu signo é: "+Signo);

}
}

/*3) Crie uma classe que representa uma Pessoa, esta classe deve implementar os atributos
Data de Nascimento, Idade e Signo. Você deve utilizar a classe LocalDate
 (disponível a partir do Java  8, no pacote java.time).*/