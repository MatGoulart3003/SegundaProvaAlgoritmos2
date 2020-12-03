package questao4main;

import java.util.Scanner;

import questao4vo.Retangulo;

public class StartApp {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo();
		retangulo = lerRetangulo(retangulo);
		
		System.out.println(retangulo.xIni);
		System.out.println(retangulo.xFim);
		System.out.println(retangulo.yIni);
		System.out.println(retangulo.yFim);
		
	}
	public static Retangulo lerRetangulo (Retangulo retangulo) {
		
		retangulo.xIni = scan.nextInt();
		retangulo.xFim = scan.nextInt();
		retangulo.yIni = scan.nextInt();
		retangulo.yFim = scan.nextInt();
		
		return retangulo;
	}
}
