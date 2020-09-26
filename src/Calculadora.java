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
		long n;
		long multiplicaoFatRepetido = 1;
		
		System.out.println("Digite o valor à ser calculado: \n");
		n = sc.nextInt();
		
		System.out.println("Ha elementos que se repetem? 1-Sim 2-Nao\n"); //
		long rpq = sc.nextInt();
	
		if( rpq == 1) 
		{
			System.out.println("Digite quantos elementos se repetem: \n");
			long qtElementoRepete = sc.nextInt();
	
			for(int i = 1 ; i <= qtElementoRepete; i++) {
				System.out.printf("\nDigite quantas vezes se repete o %dº elemento: \n", i);
				long repVezes = sc.nextInt();
				multiplicaoFatRepetido = multiplicaoFatRepetido * fatorial(repVezes);
			}// fim for
			
			calculoPermutacao(n, multiplicaoFatRepetido);
		}//fim if
		else
			calculoPermutacao(n, 1);
	
		
		
		System.out.println("Retornando ao menu...\n");
	} // fim metodo - log_permutacao

	public void calculoPermutacao(long n, long multiplicaoFatRepetido) {//calcula permutacao
		long permuta;
	    permuta = fatorial(n) / multiplicaoFatRepetido;
	    
	    System.out.println("-------------------------------");
	
		System.out.println("O resultado da permutação eh: " + permuta);
		
		System.out.println("-------------------------------");
		
	}// fim calculo permutacao
	
	//--------------------------------------------parte_arranjo------------------------------------------------//

	public void arranjo() {
		long n, p;
		
		System.out.println("Digite o valor de n em fatorial: \n");
		n = sc.nextInt();
		
		System.out.println("Digite o valor de p em fatorial: \n"); //
		p = sc.nextInt();
			
		calculoArranjo(n, p);
		
		System.out.println("-------------------------------");
		
		System.out.println("Retornando ao menu...\n");
		
		System.out.println("-------------------------------");
		
	} // fim metodo - log_arranjo

	public void calculoArranjo(long n, long p) { //calcula arranjo
		long arranjo;
	    arranjo = fatorial(n) / fatorial(p);  // 
	
		System.out.println("O resultado do Arranjo eh: " + arranjo);
		
	}// fim metodo calcula arranjo
	
	//--------------------------------parte_combinação------------------------------------------//
	
	public void combinacao() {
		long n, p;
		
		System.out.println("Digite o valor de n em fatorial: \n");
		n = sc.nextInt();
		
		System.out.println("Digite o valor de p em fatorial: \n"); //
		p = sc.nextInt();
			
		calculoCombinacao(n, p);
		
		System.out.println("-------------------------------");
		
		System.out.println("Retornando ao menu...\n");
		
		System.out.println("-------------------------------");
	} // fim metodo - log_arranjo

	public void calculoCombinacao(long n, long p) { //calcula combinacao
		long combinacao, res_sub;
		res_sub = n - p; //subtração feita no divisor para depois acrescentar o fatorial
	    combinacao = fatorial(n) / (fatorial(p) * fatorial(res_sub)); 
	
		System.out.println("O resultado da combinação eh: " + combinacao);
		
	}// fim metodo calcula combinacao
	
	
	//----------------------------------------------------------------------------//
	
	
	//calculo do fatorial de um número - metodo interativo
	public long fatorial(long n) {
		
		
		long fatorial = 1;
		
		if ( n == 1)
			return 1;
	
		fatorial = n * fatorial(n - 1);
		
		return fatorial;
		
		
	}//fim fatorial
	
}