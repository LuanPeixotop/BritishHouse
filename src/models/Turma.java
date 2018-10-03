package models;

import java.util.ArrayList;
import java.util.List;


public class Turma {
	private int codigo, capacidade, sala;
	private List<Aula> aulas = new ArrayList<>();

	public int getCodigo() {
		return codigo;
	}

	public Turma(int codigo, int capacidade, int sala) {
		super();
		this.codigo = codigo;
		this.capacidade = capacidade;
		this.sala = sala;
	}

	public Turma() {
		super();
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public void adicionarAula(Turma turma, Aula aula) {
		turma.aulas.add(aula);
	}
}
