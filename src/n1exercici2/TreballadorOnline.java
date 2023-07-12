package n1exercici2;

public class TreballadorOnline extends Treballador{

	private final int tarifaInternet = 55;
	
	public TreballadorOnline(String nom, String cognom) {
		super(nom, cognom);
	}

	@Override
	public void calcularSou(int horesTreballades) {
		System.out.println("El sou de "+super.getNom()+" "+super.getCognom()+" es de "+(horesTreballades*super.getPreuHora())+"€ mes "+tarifaInternet+"€ de tarifa plana d'internet.");
	}

	@Deprecated
	public void mostrarTarifaInternet() {
		System.out.println("La tarifa d'internet per tots els treballadors online es de "+tarifaInternet+"€");
	}
}
