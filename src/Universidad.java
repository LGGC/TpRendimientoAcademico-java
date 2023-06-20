import java.time.LocalDate;
import java.util.ArrayList;
public class Universidad {
	private ArrayList<Estudiante> alumnos = new ArrayList<Estudiante>();
	
	//Getters Setters y Constructores
	public Universidad() {}
	public ArrayList<Estudiante> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(ArrayList<Estudiante> alumnos) {
		this.alumnos = alumnos;
	}
	
	//Metodos
	private int puntajeTotalEstudiantes() {
		int puntajeTotal = 0;
		for (Estudiante estudiante : alumnos) {
			puntajeTotal += estudiante.puntaje();
		}
		return puntajeTotal;
	}

	public ArrayList<Estudiante> estudiantesPromedio() {
		ArrayList<Estudiante> estudiantesPromedio = new ArrayList<Estudiante>();
		estudiantesPromedio = puntajeMayorA(puntajeTotalEstudiantes() / alumnos.size());
		return estudiantesPromedio;
	}
	
 	public ArrayList<Estudiante> puntajeMayorA(int parametro) {
		ArrayList<Estudiante> alumnosConPuntajeMayorA = new ArrayList<Estudiante>();
		for (Estudiante estudiante : alumnos) {
			if (estudiante.esSuperior(parametro)) {
				alumnosConPuntajeMayorA.add(estudiante);
			}
		}
		return alumnosConPuntajeMayorA;
	}
 	
 	public ArrayList<Estudiante> estudiantesConMasDe10Años() {
 		LocalDate fecha = LocalDate.now();
 		int añoActual = fecha.getYear();
 		ArrayList<Estudiante> estudiantesAntiguos = new ArrayList<Estudiante>();
 		for (Estudiante estudiante : alumnos) {
			if (añoActual - estudiante.getAñoIngreso() > 10 && estudiante.getTieneTrabajo()) {
				estudiantesAntiguos.add(estudiante);
			}
		}
 		return estudiantesAntiguos;
 	}
}