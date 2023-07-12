package n1exercici1;

public class TreballadorPresencial extends Treballador {

	private static int benzina;

	public TreballadorPresencial(String nom, String cognom, int benzina) {
		super(nom, cognom);
		TreballadorPresencial.benzina = benzina;
	}

	@Override
	public void calcularSou(int horesTreballades) {
		System.out.println("El sou de "+super.getNom()+" "+super.getCognom()+" es de "+(horesTreballades*super.getPreuHora())+"€ mes "+benzina+"€ de benzina.");
	}

}