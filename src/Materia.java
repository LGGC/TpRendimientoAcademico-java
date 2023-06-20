
public abstract class Materia {
	private String carrera;
	private int añoDeLaCarrera;
	
	//Getters Setters y Constructores
	
	public Materia() {
		
	}

	
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getAñoDeLaCarrera() {
		return añoDeLaCarrera;
	}

	public void setAñoDeLaCarrera(int añoDeLaCarrera) {
		this.añoDeLaCarrera = añoDeLaCarrera;
	}

	//Metodos
	
	public abstract int puntajeFinal();
}