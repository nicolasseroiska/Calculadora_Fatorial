import java.util.Scanner;

public class CalculadoraTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calculadora calcula = new Calculadora();
		int res;
		
		res = 1;
		
		System.out.println("Iniciando...");
		System.out.println("-------------------------------");
		while (res >= 1 && res <=3) {
			System.out.println("Qual operação deseja realizar?\n"
							+  "1 - Permutação\n"
							+  "2 - Arranjo\n"
							+  "3 - Combinação\n"
							+  "4 - Sair");
			
			System.out.println("-------------------------------");
			
			res = sc.nextInt();
				
			switch(res) {
				
			case 1:
				calcula.permutacao();
				break;
			case 2:
				calcula.arranjo();
				break;
			case 3:
				calcula.combinacao();
				break;
			} //switch's end
			
		}// while's end
		
		System.out.println("Saindo...");
		
		sc.close();
	}//method's end
}
