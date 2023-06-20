import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private Boolean esRegular;
	private Boolean tieneTrabajo;
	private int a�oIngreso;

	private ArrayList<Materia> materiasAprobadas = new ArrayList<>();
	
	
	//Getters, Setters y Constructores
 	public Estudiante() {
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getEsRegular() {
		return esRegular;
	}
	public void setEsRegular(Boolean esRegular) {
		this.esRegular = esRegular;
	}
	public Boolean getTieneTrabajo() {
		return tieneTrabajo;
	}
	public void setTieneTrabajo(Boolean tieneTrabajo) {
		this.tieneTrabajo = tieneTrabajo;
	}
	public int getA�oIngreso() {
		return a�oIngreso;
	}
	public void setA�oIngreso(int a�oIngreso) {
		this.a�oIngreso = a�oIngreso;
	}
	public ArrayList<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}
	public void setMateriasAprobadas(ArrayList<Materia> materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}

	//Metodos
	public void asignarMateria(Materia materiaAprobada) {
		materiasAprobadas.add(materiaAprobada);
	}
	
	public boolean esSuperior(int parametro) {
		return puntaje() > parametro;
	}

	public int puntaje() {
		int puntajeAlumno = 0;
		for (Materia materia : materiasAprobadas) {
			puntajeAlumno += materia.puntajeFinal();
		}
		return puntajeAlumno;
	}
}