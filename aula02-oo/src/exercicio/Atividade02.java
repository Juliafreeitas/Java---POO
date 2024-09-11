package exercicio;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Pessoa02[] p = new Pessoa02[4];
		Scanner s = new Scanner(System.in);
		double sAltura = 0.0, sPeso = 0.0, pMaiorAltura = 0.0, pMaiorPeso = 0.0;
		String npMaiorAltura = "", npMaiorPeso = "";

		for (int i = 0; i < 4; i++) {
			p[i] = new Pessoa02();
			System.out.println("Digite o " + (i + 1) + "º nome: ");
			p[i].nome = s.next();

			System.out.println("Digite o " + (i + 1) + "º peso: ");
			p[i].peso = s.nextDouble();

			System.out.println("Digite a " + (i + 1) + "ª altura: ");
			p[i].altura = s.nextDouble();

		}

		for (int j = 0; j < p.length; j++) {
			sPeso += p[j].peso;
			sAltura += p[j].altura;

			if (pMaiorPeso == 0.0 || p[j].peso > pMaiorPeso) {
				pMaiorPeso = p[j].peso;
				npMaiorPeso = p[j].nome;
			}

			if (pMaiorAltura == 0.0 || p[j].altura > pMaiorAltura) {
				pMaiorAltura = p[j].altura;
				npMaiorAltura = p[j].nome;
			}
		}

		System.out.println(npMaiorPeso + " é a pessoa com maior peso, pesando: " + pMaiorPeso + "kg");
		System.out.println(npMaiorAltura + " é a pessoa com maior altura, medindo: " + pMaiorAltura + "m");
		System.out.println("A média da altura é: " + sAltura / 4);
		System.out.println("A média do peso é: " + sPeso / 4);

		s.close();

	}

}
