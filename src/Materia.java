
public abstract class Materia {
	private String carrera;
	private int a�oDeLaCarrera;
	
	//Getters Setters y Constructores
	
	public Materia() {
		
	}

	
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getA�oDeLaCarrera() {
		return a�oDeLaCarrera;
	}

	public void setA�oDeLaCarrera(int a�oDeLaCarrera) {
		this.a�oDeLaCarrera = a�oDeLaCarrera;
	}

	//Metodos
	
	public abstract int puntajeFinal();
}