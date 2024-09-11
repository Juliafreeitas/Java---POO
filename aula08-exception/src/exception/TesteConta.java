package exception;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("123-1", 2000.);

		try {
			cc.deposito(100.);
			cc.saque(200.);
			System.out.println(cc);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
