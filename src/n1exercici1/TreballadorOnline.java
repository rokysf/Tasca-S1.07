package n1exercici1;

public class TreballadorOnline extends Treballador{

	private final int tarifaInternet = 55;
	
	public TreballadorOnline(String nom, String cognom) {
		super(nom, cognom);
	}

	@Override
	public void calcularSou(int horesTreballades) {
		System.out.println("El sou de "+super.getNom()+" "+super.getCognom()+" es de "+(horesTreballades*super.getPreuHora())+"€ mes "+tarifaInternet+"€ de tarifa plana d'internet.");
	}
	
}
