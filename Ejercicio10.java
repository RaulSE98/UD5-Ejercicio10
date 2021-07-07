import java.util.Scanner;


public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int venta;
		
		System.out.println("Introduce numero de ventas");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Introduce precio de la venta");
			venta = sc.nextInt();
			suma = suma + venta;
		}
		System.out.println("La suma de todas las ventas es " +suma + " euros.");

	}

}
