package Exercicio1;

public class RespostaUm {

	public static void main(String[] args) {

		System.out.println("RESOLUÇÃO CONFORME ENUNCIADO NÃO SEQUENCIAL");
		System.out.println("");

		int arrayNumbers[] = { 1, 2, 5, 8, 9 };

		for (int i = 0; i < arrayNumbers.length; i++) {

			int valorAntes = 0;
			if (i > 0) {
				valorAntes = arrayNumbers[i - 1];
			}

			if (valorAntes + 1 == arrayNumbers[i]) {
				System.out.println("Array na posição[" + i + "] = " + arrayNumbers[i]);
			} else {
				System.out.println("Array na posição[" + i + "] = " + arrayNumbers[i] + " não é sequencial");
			}
		}
	}
}
