package relacao;

public class TestarTime {

	public static void main(String[] args) {
		Atleta a1 = new Atleta("Carlos", 26);
		Atleta a2 = new Atleta("Robeto", 28);
		Atleta a3 = new Atleta("Luís", 24);

		Time time = new Time("Brasil", new Atleta[11]);

		time.adicionarAtleta(a1);
		time.adicionarAtleta(a2);
		time.adicionarAtleta(a3);

		time.mostrarTime();
	}

}
