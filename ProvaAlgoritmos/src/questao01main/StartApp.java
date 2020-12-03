package questao01main;

import questao01vo.Data;
import questao01vo.Periodo;

public class StartApp {
	
	
	public static void main(String[] args) {
		
		Data data = new Data ();
		Periodo periodo = new Periodo ();
		populaInicioFim (periodo);
		System.out.println(estaDentro(periodo,data));
		
		
		
		
		
	}
	public static boolean estaDentro (Periodo periodo, Data data) {
		
		data.dia = 11;
		data.mes = 06;
		data.ano = 2020;
		
		if (periodo.inicio.ano < data.ano && periodo.fim.ano > data.ano) {
		
			return true;			
		
		}else if(periodo.inicio.ano == data.ano || periodo.fim.ano == data.ano) {
			
			if (periodo.inicio.mes < data.mes && periodo.fim.mes > data.mes) {
				
				return true;
				
			}else if (periodo.inicio.mes == data.mes || periodo.fim.mes == data.mes) {
				
				if(periodo.inicio.dia < data.dia && periodo.fim.dia > data.dia) {
					
					return true;
				}
				
			}
			
		}
		
		
		return false;
	}
	public static void populaInicioFim (Periodo periodo) {
		periodo.inicio.dia = 10;
		periodo.inicio.mes = 03;
		periodo.inicio.ano = 2020;
		periodo.fim.dia = 20;
		periodo.fim.mes = 05;
		periodo.fim.ano = 2020;
	}
	
}
