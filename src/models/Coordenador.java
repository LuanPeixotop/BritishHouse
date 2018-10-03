package models;

public class Coordenador extends Pessoa {

	private int codigo;
	
	public Coordenador(String nome, String cpf, String endereco) {
		super(nome, cpf, endereco);
	}
	
	public Coordenador() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
