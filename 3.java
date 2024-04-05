import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        int numero = 0;
        float notaUm;
		float notaDois;
		float somaUm = 0;
		float somaDois = 0;
		float mediaUm;
		float mediaDois;
		
		
		while(numero < 5) {
			numero++;
			System.out.println(String.format("Informe a %dº nota do primeiro aluno", numero));     
		    notaUm = sc.nextFloat();
			 somaUm+=notaUm;  
		}
		
		mediaUm = somaUm/5;
		numero = 0;
		
		System.out.println("\n");
			
		while(numero < 5) {
			numero++;
			System.out.println(String.format("Informe %dº a nota do segundo aluno", numero));     
		    notaDois = sc.nextFloat();
			 somaDois+=notaDois;  
		}
		
		mediaDois = somaDois/5;
		
		System.out.println("\n");
		
	
	    System.out.println(String.format("Media do primeiro aluno: %.2f", mediaUm));
	
		if(mediaUm >= 7) {
			System.out.println("Primeiro aluno aprovado");
		} else if( mediaUm < 7 && mediaUm >= 4) {
			System.out.println("Primeiro aluno reprovado com direito a recuperação");
		} else if( mediaUm < 4 ) {
			System.out.println("Primeiro aluno reprovado sem direito a recuperação");
		}
	
		
		
		System.out.println("\n");
		
		System.out.println(String.format("Media do segundo aluno: %.2f", mediaDois));
		
			if(mediaDois >= 7) {
			System.out.println("Segundo aluno aprovado");
		} else if( mediaDois < 7 && mediaDois > 4) {
			System.out.println("Segundo aluno reprovado com direito a recuperação");
		} else if( mediaDois < 4 ) {
			System.out.println("Segundo aluno reprovado sem direito a recuperação");

		}
		
		
	}

}
