import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
         int numero = 0;
		float nota;
		float soma = 0;
		float media;
		
		while(numero <= 4) {
			numero++;
			System.out.println(String.format("Informe %dº numero", numero));     
		    nota = sc.nextFloat();
				    soma+=nota;  
		}
		
		media = soma/5;
		
		
		if(media >= 7) {
			System.out.println("Aprovado");
		} else if( media < 7 && media > 4) {
			System.out.println("Reprovado com direito a recuperação");
		} else if( media < 4 ) {
			System.out.println("Reprovado sem direito a recuperação");

		}
		
		
		
		
		
	}

}
