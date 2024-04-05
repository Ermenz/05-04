import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

    Scanner sc = new Scanner(System.in);
    
	float[] produtoAmes = new float[3];
	float[] produtoBmes = new float[3];
	float[] produtoCmes = new float[3];
	
	
	float vmdA;
	float eminA;
	float emaxA;

	float vmdB;
	float eminB;
	float emaxB;

	float vmdC;
	float eminC;
	float emaxC;
	
	
    int
	for (int i = 0; i < 3; i ++) {
         System.out.println(String.format("Digite %dº mês do produto A", i));
        produtoAmes[i] = sc.nextFloat();
     }
     
     System.out.println ("\n");    
     j = 1;
    for (int i = 0; i < 3; i ++) {
         System.out.println(String.format("Digite  %dº mês do produto B:", i));
        produtoBmes[i] = sc.nextFloat();
     } 
     
    System.out.println ("\n");
      j = 1;
	for (int i = 0; i < 3; i ++) {
     System.out.println(String.format("Digite  %dº mês do produto C:", i));
        produtoCmes[i] = sc.nextFloat();
     } 
	
        System.out.println ("\n");
		System.out.println("Informe o valor de trA"); 
	  	float trA  = sc.nextInt();
	  	
	  	System.out.println("Informe o valor de lrA"); 
	  	float lrA  = sc.nextInt();
	  	
	  	System.out.println("Informe o valor de eaA"); 
	  	float eaA  = sc.nextInt();
	  	
	  	System.out.println ("\n");
	  	System.out.println("Informe o valor de trB"); 
	  	float trB  = sc.nextInt();
	  	
	  	System.out.println("Informe o valor de lrB"); 
	  	float lrB  = sc.nextInt();
	  	
	  	System.out.println("Informe o valor de eaB"); 
	  	float eaB  = sc.nextInt();
	  	
	  	System.out.println ("\n");
	  	System.out.println("Informe o valor de trC"); 
	  	float trC  = sc.nextInt();
	
		System.out.println("Informe o valor de lrC"); 
	  	float lrC  = sc.nextInt();
	
		System.out.println("Informe o valor de eaC"); 
	  	float eaC  = sc.nextInt();
		
		
		
	  	
	vmdA = ((produtoAmes[0] + produtoAmes[1] + produtoAmes[2]) / 3) / 25;

	eminA = (vmdA * trA);

	emaxA = (lrA + eminA);


	vmdB = ((produtoBmes[0] + produtoBmes[1] + produtoBmes[2]) / 3) / 25;

	eminB = (vmdB * trB);

	emaxB = (lrB + eminB);


	vmdC = ((produtoCmes[0] + produtoCmes[1] + produtoCmes[2]) / 3) / 25;

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
