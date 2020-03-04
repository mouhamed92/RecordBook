package entite;

public class Organisation extends Record {
	
	private String adresse ;



	
	public Organisation() {
		super();

	}


	public Organisation(String nom, String tel, boolean isPerson, String adresse) {
		super(nom, tel, isPerson);
		this.nom=nom ;
		this.tel=tel;
		this.adresse = adresse;
		this.isPerson=false;
	}


	public String getAdresse() {
		System.out.println("Enter the Adresse:");
		nom = sc.nextLine();
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
