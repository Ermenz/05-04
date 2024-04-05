import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

    Scanner sc = new Scanner(System.in);
    
	float produtoAmes;
	float produtoBmes;
	float produtoCmes;
    float somaprodutoA= 0;
    float somaprodutoB= 0;
    float somaprodutoC= 0;
	
	int cont = 0;
	
	float vmdA;
	float eminA;
	float emaxA;

	float vmdB;
	float eminB;
	float emaxB;

	float vmdC;
	float eminC;
	float emaxC;
	
	
    
      while(cont < 4) {
          cont++;
         System.out.println(String.format("Digite %dº mês do produto A", cont));
        produtoAmes = sc.nextFloat();
         somaprodutoA+= produtoAmes;
     }
     
     System.out.println ("\n");    
      cont = 0;
     
   while(cont < 4) {
        cont++;
         System.out.println(String.format("Digite  %dº mês do produto B:", cont));
        produtoBmes = sc.nextFloat();
           somaprodutoB+= produtoBmes;
     } 
     
    System.out.println ("\n");
      cont = 0;


   while(cont < 4) {
       cont++;
     System.out.println(String.format("Digite  %dº mês do produto C:", cont));
        produtoCmes = sc.nextFloat();
        somaprodutoC+= produtoCmes;
   }
	
        System.out.println ("\n");
		System.out.println("Informe o valor de trA"); 
	  	 float trA  = sc.nextFloat();
	  	
	  	System.out.println("Informe o valor de lrA"); 
	  	float lrA  = sc.nextFloat();
	  	
	  	System.out.println("Informe o valor de eaA"); 
	  	float eaA  = sc.nextFloat();
	  	
	  	System.out.println ("\n");
	  	System.out.println("Informe o valor de trB"); 
	  	float trB  = sc.nextFloat();
	  	
	  	System.out.println("Informe o valor de lrB"); 
	  	float lrB  = sc.nextFloat();
	  	
	  	System.out.println("Informe o valor de eaB"); 
	  	float eaB  = sc.nextFloat();
	  	
	  	System.out.println ("\n");
	  	System.out.println("Informe o valor de trC"); 
	  	float trC  = sc.nextFloat();
	
		System.out.println("Informe o valor de lrC"); 
	  	float lrC  = sc.nextFloat();
	
		System.out.println("Informe o valor de eaC"); 
	  	float eaC  = sc.nextFloat();
		
		
		
	  	
	vmdA = (somaprodutoA/ 4) / 25;

	eminA = (vmdA * trA);

	emaxA = (lrA + eminA);


	vmdB = (somaprodutoB / 4) / 25;

	eminB = (vmdB * trB);

	emaxB = (lrB + eminB);


	vmdC = (somaprodutoC/ 4) / 25;

	eminC = (vmdC * trC);

	emaxC = (lrC + eminC);

    System.out.println ("\n");
	System.out.println (String.format ("Valor da venda media diária do produto A :%.2f", vmdA));
	System.out.println (String.format ("Valor do estoque mínimo  do produto A :%.2f", eminA));
	System.out.println (String.format ("Valor do estoque máximo do produto A :%.2f", emaxA));

	if (eaA > eminA)
	  {
		System.out.println ("Não comprar");
	  }
	else
	  {
		System.out.println ("Comprar");
	  }

    System.out.println ("\n");
    System.out.println (String.format ("Valor da venda media diária do produto B :%.2f", vmdB));
	System.out.println (String.format ("Valor do estoque mínimo  do produto B :%.2f", eminB));
	System.out.println (String.format ("Valor do estoque máximo do produto B :%.2f", emaxB));


	if (eaB > eminB)
	  {
		System.out.println ("Não comprar");
	  }
	else
	  {
		System.out.println ("Comprar");
	  }

    System.out.println ("\n");
    System.out.println (String.format ("Valor da venda media diária do produto C :%.2f", vmdC));
	System.out.println (String.format ("Valor do estoque mínimo  do produto C :%.2f", eminC));
	System.out.println (String.format ("Valor do estoque máximo do produto C :%.2f", emaxC));

	if (eaC > eminC)
	  {
		System.out.println ("Não comprar");
	  }
	else
	  {
		System.out.println ("Comprar");
	  }

  }
}
