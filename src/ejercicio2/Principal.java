package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String aux;
		double grados;
		Temperatura t = new Temperatura();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los ºC que desea pasar a Farenheit:");
		
		try {
			aux=sc.nextLine();
			grados = Double.parseDouble(aux);
			t.comprobarTemperatura();
		}catch(ExcepcionTemperatura e) {
			
		}

	}

}
