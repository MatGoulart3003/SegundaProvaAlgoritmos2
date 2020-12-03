package questao2main;


import questao2vo.Ponto;
import questao2vo.Retangulo;

public class StartApp {
	
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo ();
		Ponto ponto = new Ponto ();
		populaInicioFim (retangulo);
		if(estaDentro(retangulo,ponto) == true) {
			
			System.out.println("O ponto está dentro");
			
		}else {
			
			System.out.println("o ponto está fora");
		}
		
		
	}
	
	public static boolean estaDentro (Retangulo retangulo,Ponto p) {
		
		 if (retangulo.inicio.x <= p.x && retangulo.fim.x >= p.x && retangulo.inicio.y <= p.y && retangulo.fim.y >= p.y ) {

	            return true;

	        }
  
		
		return false;
	}
	
	public static void populaInicioFim (Retangulo retangulo) {
		
		retangulo.inicio.x = 2;
	    retangulo.fim.x = 5;

	    retangulo.inicio.y = 1;
	    retangulo.fim.y = 3;
		
	}
	
}
