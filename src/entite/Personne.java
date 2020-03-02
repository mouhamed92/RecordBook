package entite;

public class Personne extends Record {
	
	private String prenom ;
	private String dateN ;
	private String genre ;

	public Personne() {
		
	
	}

	public Personne(String nom, String tel, boolean isPerson, String prenom, String dateN, String genre) {
		this.nom=nom;
		this.prenom = prenom;
		this.tel=tel;
		this.dateN = dateN;
		this.genre = genre;
		this.isPerson=true;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateN() {
		return dateN;
	}

	public void setDateN(String dateN) {
		this.dateN = dateN;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
}
