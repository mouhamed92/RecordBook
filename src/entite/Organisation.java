package entite;

public class Organisation extends Record {
	
	private String adresse ;



	
	public Organisation(String nom, String tel, boolean isPerson, String adresse) {
		this.nom=nom ;
		this.tel=tel;
		this.adresse = adresse;
		this.isPerson=false;
	}


	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	

}
