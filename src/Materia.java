
public abstract class Materia {
	private String carrera;
	private int aņoDeLaCarrera;
	
	//Getters Setters y Constructores
	
	public Materia() {
		
	}

	
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getAņoDeLaCarrera() {
		return aņoDeLaCarrera;
	}

	public void setAņoDeLaCarrera(int aņoDeLaCarrera) {
		this.aņoDeLaCarrera = aņoDeLaCarrera;
	}

	//Metodos
	
	public abstract int puntajeFinal();
}