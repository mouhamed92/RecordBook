package entite;

public class Personne extends Record {
	
	private String prenom ;
	private String dateN ;
	private String genre ;

	public Personne() {
		
		
	}

	public Personne(String nom, String prenom,String tel, String dateN,boolean isPerson, String genre) {
		super(nom, tel, isPerson);
		this.prenom = prenom;
		this.dateN = dateN;
		this.genre = genre;
	}


	public String getPrenom() {
		System.out.println("Enter the surname:");
		prenom = sc.nextLine();
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateN() {
		System.out.println("Enter the birth day:");
		dateN = sc.nextLine();
		return dateN;
	}

	public void setDateN(String dateN) {
		this.dateN = dateN;
	}

	public String getGenre() {
		System.out.println("Enter the gender(M/W):");
		genre = sc.nextLine();
		return genre;
	}
	public void setGenre(String genre) {
		
		this.genre = genre;
	}

	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+this.prenom ;
	}
}
