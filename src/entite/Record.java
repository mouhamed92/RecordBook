package entite;

import java.util.Scanner;

public abstract class  Record {
	
	protected  String nom ;
	protected String tel ;
	protected  boolean isPerson ;
	
	Scanner sc = new Scanner(System.in);
	
	public Record() {
		super();
	}
	
	
	
	public Record(String nom, String tel, boolean isPerson) {
		super();
		this.nom = nom;
		this.tel = tel;
		this.isPerson = isPerson;
	}



	public String getNom() {
		
		System.out.println("Enter the name:");
		nom = sc.nextLine();
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTel() {
		System.out.println("Enter the tel:");
		tel = sc.nextLine();
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
