package Teste;

public class RespostaDois {

	public static void main(String[] args) {

		System.out.println("RESOLUÇÃO VERIFICANDO SE É IMPAR OU PAR");
		System.out.println("");

		int arrayNumbers[] = { 1, 2, 5, 8, 9 };

		for (int i = 0; i < arrayNumbers.length; i++) {

			if (arrayNumbers[i] % 2 != 0) {
				System.out.println("Array na posição[" + i + "] = " + arrayNumbers[i] + " impar ");
			} else {
				System.out.println("Array na posição[" + i + "] = " + arrayNumbers[i]);
			}
		}

	}

}
