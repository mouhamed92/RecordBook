package entite;

public abstract class  Record {
	
	protected String nom ;
	protected String tel ;
	protected boolean isPerson ;
	
	
		
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public boolean isPerson() {
		return isPerson;
	}
	public void setPerson(boolean isPerson) {
		this.isPerson = isPerson;
	}
	
	
	

}
