
public class MateriaObligatoria extends Materia {
	private int puntajeBase;
	private Boolean recursoLaMateria;
	
	
	//Getters, Setters y Constructores
 	public MateriaObligatoria() {
		
	}
	public int getPuntajeBase() {
		return puntajeBase;
	}
	public void setPuntajeBase(int puntajeBase) {
		this.puntajeBase = puntajeBase;
	}
	
	//Metodos
	public int puntajeFinal() {
		if (!recursoLaMateria) {
			return puntajeBase * getAñoDeLaCarrera();
		} else {
			return puntajeBase;
		}
	}
}
