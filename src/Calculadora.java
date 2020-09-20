// Calculadora - Análise Combinatória
// Integrantes:
// Gabriel Araújo
// Nicolas Seroiska
// Sayid Safa



import java.util.Scanner;
public class Calculadora {
	
	private Scanner sc = new Scanner(System.in);
	
	//---------------------------------------------parte_permutação-----------------------------------------------//
	
	public void permutacao() {
		int n;
		int multiplicaoFatRepetido = 1;
		
		System.out.println("Digite o valor à ser calculado: \n");
		n = sc.nextInt();
		
		System.out.println("Ha elementos que se repetem? 1-Sim 2-Nao\n"); //
		int rpq = sc.nextInt();
	
		if( rpq == 1) 
		{
			System.out.println("Digite quantos elementos se repetem: \n");
			int qtElementoRepete = sc.nextInt();
	
			for(int i = 1 ; i <= qtElementoRepete; i++) {
				System.out.printf("\nDigite quantas vezes se repete o %dº elemento: \n", i);
				int repVezes = sc.nextInt();
				multiplicaoFatRepetido = multiplicaoFatRepetido * fatorial(repVezes);
			}// fim for
			
			calculoPermutacao(n, multiplicaoFatRepetido);
		}//fim if
		else
			calculoPermutacao(n, 1);
	
		
		
		System.out.println("Retornando ao menu...\n");
	} // fim metodo - log_permutacao

	public void calculoPermutacao(int n, int multiplicaoFatRepetido) {//calcula permutacao
		int permuta;
	    permuta = fatorial(n) / multiplicaoFatRepetido;
	    
	    System.out.println("-------------------------------");
	
		System.out.println("O resultado da permutação eh: " + permuta);
		
		System.out.println("-------------------------------");
		
	}// fim calculo permutacao
	
	//--------------------------------------------parte_arranjo------------------------------------------------//

	public void arranjo() {
		int n, p;
		
		System.out.println("Digite o valor de n em fatorial: \n");
		n = sc.nextInt();
		
		System.out.println("Digite o valor de p em fatorial: \n"); //
		p = sc.nextInt();
			
		calculoArranjo(n, p);
		
		System.out.println("-------------------------------");
		
		System.out.println("Retornando ao menu...\n");
		
		System.out.println("-------------------------------");
		
	} // fim metodo - log_arranjo

	public void calculoArranjo(int n, int p) { //calcula arranjo
		int arranjo;
	    arranjo = fatorial(n) / fatorial(p);  // 
	
		System.out.println("O resultado do Arranjo eh: " + arranjo);
		
	}// fim metodo calcula arranjo
	
	//--------------------------------parte_combinação------------------------------------------//
	
	public void combinacao() {
		int n, p;
		
		System.out.println("Digite o valor de n em fatorial: \n");
		n = sc.nextInt();
		
		System.out.println("Digite o valor de p em fatorial: \n"); //
		p = sc.nextInt();
			
		calculoCombinacao(n, p);
		
		System.out.println("-------------------------------");
		
		System.out.println("Retornando ao menu...\n");
		
		System.out.println("-------------------------------");
	} // fim metodo - log_arranjo

	public void calculoCombinacao(int n, int p) { //calcula combinacao
		int combinacao;
	    combinacao = fatorial(n) / fatorial(p) * (fatorial(n) - fatorial(p));  // 
	
		System.out.println("O resultado da combinação eh: " + combinacao);
		
	}// fim metodo calcula combinacao
	
	
	//----------------------------------------------------------------------------//
	
	
	//calculo do fatorial de um número - metodo interativo
	public int fatorial(int n) {
		
		
		int fatorial = 1;
		
		if ( n == 1)
			return 1;
	
		fatorial = n * fatorial(n - 1);
		
		return fatorial;
		
		
	}//fim fatorial
	
}