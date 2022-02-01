import java.util.Scanner; 


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bienvenido a la calculadora de Gustavo");
		System.out.println("¿Que desea Hacer?");
		System.out.println("Seleccione la opcion");
		System.out.println("1.-Suma");
		System.out.println("2.-Resta");
		System.out.println("3.-Multiplicacion");
		System.out.println("4.-Division");
		
		int opcion = scanner.nextInt();
		
		
		switch (opcion){
		case 1:
			System.out.println("Que numeros desea Sumar");
			System.out.println("Ingrese el primer numero");
			int num1 = scanner.nextInt();
			System.out.println("Ingrese el segundo numero");
			int num2 = scanner.nextInt();
			
			int suma= Calculadora.suma(num1,num2);
			System.out.println("El Resultador es :" + suma);
			
			break;
			
		case 2:
			System.out.println("Que numeros desea restar");
			System.out.println("Ingrese el primer numero");
			int num3 = scanner.nextInt();
			System.out.println("Ingrese el segundo numero");
			int num4 = scanner.nextInt();
			
			int resta= Calculadora.resta(num3,num4);
			System.out.println("El Resultador es :" + resta);
			
			break;
			
		case 3:
			
			System.out.println("Que numeros desea multiplicar");
			System.out.println("Ingrese el primer numero");
			int num5 = scanner.nextInt();
			System.out.println("Ingrese el segundo numero");
			int num6 = scanner.nextInt();
			
			int multiplicacion= Calculadora.multiplicacion(num5,num6);
			System.out.println("El Resultador es :" + multiplicacion);
			break;
			
		case 4:
			
			System.out.println("Que numeros desea multiplicar");
			System.out.println("Ingrese el primer numero");
			int num7 = scanner.nextInt();
			System.out.println("Ingrese el segundo numero");
			int num8 = scanner.nextInt();
			
			float div= Calculadora.div(num7,num8);
			System.out.println("El Resultador es :" + div);
			break;		
			
		default :
			System.out.println("Ingrese la opcion correcta");
			break;
			
		
		}
		
	
	}
	

	
}

