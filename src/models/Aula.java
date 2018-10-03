package models;

public class Aula {
	private String local;
	private int horaInicio, horaFim;
	
	public Aula(String local, int horaInicio, int horaFim) {
		super();
		this.local = local;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
	}

	public Aula() {
		super();
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(int horaFim) {
		this.horaFim = horaFim;
	}
	
}
