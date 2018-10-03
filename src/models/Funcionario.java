package models;

public class Funcionario extends Pessoa {
	
	private int codigo;

	public Funcionario(String nome, String cpf, String endereco) {
		super(nome, cpf, endereco);
	}
	
	public Funcionario() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

}
