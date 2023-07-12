package n1exercici2;

public class Treballador {

	private String nom;
	private String cognom;
	private final static int preuHora = 15;

	public Treballador(String nom, String cognom) {
		this.nom = nom;
		this.cognom = cognom;
	}

	public String getNom() {
		return nom;
	}

	public String getCognom() {
		return cognom;
	}

	public static int getPreuHora() {
		return preuHora;
	}

	public void calcularSou(int horesTreballades) {
		System.out.println("El sou de "+this.nom+" "+this.cognom+" es de " + (horesTreballades * preuHora) + "€.");
	}
}
