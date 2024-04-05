import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        int numero = 0;
		float mes;
		float soma = 0;
		float vmd;
		float tr = 5;
		float ea = 70;
		float lr = 50;
		
		
		while(numero < 7) {
			numero++;
			System.out.println(String.format("Informe %dº mês", numero));     
		    mes = sc.nextFloat();
				    soma+=mes;  
		}
		
		vmd = (soma/7)/25;
		
		float emin = (vmd*tr);
		    
		float emax = (lr+emin);
		
		System.out.println(String.format("%.2f", vmd));
		System.out.println(String.format("%.2f", emin));
		System.out.println(String.format("%.2f", emax));
		
		
		
		if(ea >= emin) {
			System.out.println("Não comprar");
		}else { 
			System.out.println("Comprar");
		} 
			

		
		
		
		
		
		
	}

}
