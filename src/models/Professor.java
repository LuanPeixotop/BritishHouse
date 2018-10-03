package models;

public class Professor extends Pessoa {
	
	private int codigo;
	
	public Professor(String nome, String cpf, String endereco) {
		super(nome, cpf, endereco);
	}
	
	public Professor() {
		super();
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
