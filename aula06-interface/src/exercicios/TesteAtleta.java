package exercicios;

public class TesteAtleta {

	public static void main(String[] args) {
		Pais p1 = new Pais("Brasil");
		Pais p2 = new Pais("EUA");

		Atleta a1 = new Atleta("Anderson Silva", 98., p1);
		Atleta a2 = new Atleta("Jon Jone", 59., p2);
		Atleta a3 = new Atleta("Vitor Belford", 110., p1);

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println("Total de participantes: " + Atleta.getTotalParticipantes());

	}

}
