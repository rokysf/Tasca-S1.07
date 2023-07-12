package n1exercici2;

public class Principal {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Treballador t1 = new Treballador("Joan","Marti");
		TreballadorPresencial tp1 = new TreballadorPresencial("Maria","Moreno",150);
		TreballadorOnline to1 = new TreballadorOnline("Jordi","Gonzalez");
		
		t1.calcularSou(160);
		tp1.calcularSou(160);
		to1.calcularSou(160);
		
		tp1.mostrarBenzina();
		to1.mostrarTarifaInternet();
	}
}
