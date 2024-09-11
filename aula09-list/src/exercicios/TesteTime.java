package exercicios;

public class TesteTime {
	
	public static void main(String[] args) {
		Atleta a1 = new Atleta("Vinicius", 26, "CA");
		Atleta a2 = new Atleta("Wesseley", 26, "Banco");
		
		Time time = new Time("Vasco", "Rafael Paiva", "Eurico");
		time.addAtleta(a1);
		time.addAtleta(a2);
		
		System.out.println(time);
		time.mostrarTime();
	}

}
