package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Realizar un programa que haga las operaciones básicas de una calculadora solo con números enteros 
//		(sumar, resta, multiplicar, dividir y raíz cuadrada) teniendo en cuenta las posibles excepciones que se pueden producir 
//		(entrada de datos, división por cero, raíz de un número negativo, etc.)
		
		int num1,num2,opcion=1;
		float result;
		boolean opcionIncorrecta = true;
		
		do {
			imprimirMenu();
			try {
				opcion=Leer.datoInt();
				opcionIncorrecta = false;
				
				switch(opcion) {
				case 0:
					System.out.println("Gracias por utilizar el programa.");
					break;
					
				case 1:
					System.out.println("Indique el primer número:");
					num1=Leer.datoInt();
					
					System.out.println("Indique el segundo número");
					num2=Leer.datoInt();
					
					result = num1+num2;
					System.out.println(num1+ " + " +num2+ " = " + result );
					break;
					
				case 2:
					System.out.println("Indique el primer número:");
					num1=Leer.datoInt();
					
					System.out.println("Indique el segundo número");
					num2=Leer.datoInt();
					
					result = num1-num2;
					System.out.println(num1+ " - " +num2+ " = " + result );
					break;
					
				case 3:
					System.out.println("Indique el primer número:");
					num1=Leer.datoInt();
					
					System.out.println("Indique el segundo número");
					num2=Leer.datoInt();
					
					result = num1*num2;
					System.out.println(num1+ " * " +num2+ " = " + result );
					break;
					
				case 4:
					System.out.println("Indique el primer número:");
					num1=Leer.datoInt();
					
					System.out.println("Indique el segundo número");
					num2=Leer.datoInt();
					
					result = num1/num2;
					System.out.println(num1+ " / " +num2+ " = " + result );
					break;
					
				case 5:
					System.out.println("Indique el número:");
					num1=Leer.datoInt();
					result = (float) Math.sqrt(num1);
					System.out.println("La raiz cuadrada de "+num1+" es: "+result);
					break;
					
					default:
						System.out.println("Elija una opción correcta. \n");
					
				}	
			}catch(NumberFormatException e) {
				if (opcionIncorrecta) {
					System.out.println("Elija una opción correcta. \n");
				}else{
					System.out.println("Indique un entero. \n");
				}
			}catch(ArithmeticException e) {
				System.out.println("No se puede dividir entre 0. \n");
			}
			
		}while(opcion !=0);
	}

	public static void imprimirMenu() {
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Raiz cuadrada");
		System.out.println("0. Salir del programa");
	}

}
