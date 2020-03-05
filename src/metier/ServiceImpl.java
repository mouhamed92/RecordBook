package metier;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import entite.Organisation;
import entite.Personne;
import entite.Record;

public class ServiceImpl implements IService {

	List<Record> records;
	String typeR;
	int i;
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);

	public ServiceImpl() {

		records = new ArrayList<Record>();
	}

	@Override
	public boolean add() {

		do {
			System.out.println("Enter the type (person, organization):");
			typeR = sc1.nextLine();
		} while (!typeR.equals("person") && !typeR.equals("organization"));

		if (typeR.equals("person")) {

			Personne p = new Personne();
			p.setNom(p.getNom());
			p.setPrenom(p.getPrenom());
			p.setTel(p.getTel());
			p.setPerson(true);
			p.setDateN(p.getDateN());
			p.setGenre(p.getGenre());

			System.out.println("Record added!");
			return records.add(p);

		} else if (typeR.equals("organization")) {

			Organisation o = new Organisation();
			o.setNom(o.getNom());
			o.setAdresse(o.getAdresse());
			o.setTel(o.getTel());
			o.setPerson(false);

			System.out.println("Record added!");
			return records.add(o);
		}
		return false;
	}

	@Override
	public boolean remove() throws InputMismatchException {
		
		try {
			if (records.isEmpty()) {
				System.out.println("0 records");
				return false;
			} else {
				afficheListe(records);
				System.out.println("Select a record:");
				i = sc.nextInt();
				records.remove(i);
				System.out.println("Record removered!");
				return true;}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());;
		}
		return false;
		
		}
	

	@Override
	public boolean edit() throws InputMismatchException {

		boolean verif = false;
		try {

			if (records.isEmpty()) {

				System.out.println("0 records");
				return verif;
			} else {

				afficheListe(records);

				System.out.println("Select a record:");
				i = sc.nextInt();
				

				verif = modification(i);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return verif;
	}

	@Override
	public int count() {

		return records.size();
	}

	@Override
	public Record info(int i) {

		/*
		 * for(Record record : records){ if(record.isPerson()){ Personne p
		 * =(Personne)record ; System.out.println(p.toString()); } }
		 */
		return null;
	}

	@Override
	public void exit() {

	}

	private void afficheListe(List<Record> r) {
		for (Record record : records) {
			if (record.isPerson()) {
				Personne p = (Personne) record;
				System.out.println(records.indexOf(record) + " " + p.toString());
			} else {
				Organisation o = (Organisation) record;
				System.out.println(records.indexOf(record) + " " + o.toString());
			}
		}

	}

	private boolean modification(int i) {

		boolean verif = false;
		String champ;
		if (records.get(i).isPerson()) {
			Record p = (Personne) records.get(i);

			System.out.println("Select a field (name, surname, birth, gender, number):");
			champ = sc1.nextLine();
			  
				if (champ.equals("name")) {
					System.out.println("Enter the name");
					p.setNom(sc1.nextLine());
				} else if (champ.equals("surname")) {
					System.out.println("Enter the surname");
					p.setNom(sc1.nextLine());
				} else if (champ.equals("birth")) {
					System.out.println("Enter the birth");
					p.setNom(sc1.nextLine());
				} else if (champ.equals("gender")) {
					System.out.println("Enter the gender");
					p.setNom(sc1.nextLine());
				} else if (champ.equals("number")) {
					System.out.println("Enter the number");
					p.setNom(sc1.nextLine());
				} else {
					System.out.println("Unkown input");
				}
				verif = true;
			
			} else {

				Organisation o = (Organisation) records.get(i);
				System.out.println("Select a field (organisation name, adresse, number):");
				champ = sc1.nextLine();
				if (champ.equals("organisation name")) {
					System.out.println("Enter the name");
					o.setNom(sc1.nextLine());
				} else if (champ.equals("adresse")) {
					System.out.println("Enter the adresse");
					o.setNom(sc1.nextLine());
				} else if (champ.equals("number")) {
					System.out.println("Enter the number");
					o.setNom(sc1.nextLine());
				} else {
					System.out.println("Unkown input");
				}
				verif = true;	
			}
			
			return verif;
			
}}
