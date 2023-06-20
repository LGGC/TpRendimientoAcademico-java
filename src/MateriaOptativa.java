
public class MateriaOptativa extends Materia{
	private int indiceDificultad;
	private int duracionEnHoras;
	
	
	//Getters Setters y Constructor
	public MateriaOptativa() {
		
	}

	public int getIndiceDificultad() {
		return indiceDificultad;
	}

	public void setIndiceDificultad(int indiceDificultad) {
		this.indiceDificultad = indiceDificultad;
	}

	public int getDuracionEnHoras() {
		return duracionEnHoras;
	}

	public void setDuracionEnHoras(int duracionEnHoras) {
		this.duracionEnHoras = duracionEnHoras;
	}
	
	//Materias
	public int puntajeFinal() {
		return indiceDificultad * duracionEnHoras;
	}
}
