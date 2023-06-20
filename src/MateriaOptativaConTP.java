
public class MateriaOptativaConTP extends MateriaOptativa{
	public MateriaOptativaConTP() {
	}
	
	public int puntajeFinal() {
		return (getIndiceDificultad() * getDuracionEnHoras()) + 10;
	}
}