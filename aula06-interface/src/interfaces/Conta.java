package interfaces;

//interface nn pode ser instanciada, nao tem implementacao, atriutos sao final (const), abstrata
public interface Conta {
	Double IMPOSTO = 10.;

	void saque(Double valor);

	void deposito(Double valor);

}
