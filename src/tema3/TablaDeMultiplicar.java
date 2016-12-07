package tema3;

import java.util.Scanner;

public class TablaDeMultiplicar {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = 0, i = 0;

		System.out.println("Introducir numero");
		n = sc.nextInt();
		for (i = 0; i <= 12; i++) {

			int total = n * i;

			System.out.println(n + "x" + i + "=" + total);

		}
	}

}
