package metier;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entite.Organisation;
import entite.Personne;
import entite.Record;


public class ServiceImpl implements IService {
	
	List<Record> records ;
	String typeR , champ ;
	int i ;
    Scanner sc = new Scanner(System.in);
    
	public ServiceImpl() {
	 
		records = new ArrayList<Record>();
	}

	@Override
	public boolean add() {
		
		do{
		System.out.println("Enter the type (person, organization):");
		typeR = sc.nextLine();
		}while(!typeR.equals("person") && !typeR.equals("organization"));
		
		if(typeR.equals("person")){
			
			Personne p = new Personne();
			p.setNom(p.getNom());
			p.setPrenom(p.getPrenom());
			p.setTel(p.getTel());
			p.setPerson(true);
			p.setDateN(p.getDateN());
			p.setGenre(p.getGenre());
			
			System.out.println("Record added!");
			return records.add(p);
				
		}else if(typeR.equals("organization")){
			
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
	public boolean remove() {
		if(records.isEmpty()){
			System.out.println("0 records");
			return false ;
		}else{
			afficheListe(records);
			System.out.println("Select a record:");
			i = sc.nextInt();
		    records.remove(i);
		    System.out.println("Record removered!");
		    return true ;
		}	
	}

	

	@Override
	public boolean edit() {
		boolean verif = false ;
		if(records.isEmpty()){
			System.out.println("0 records");
			return verif ;
		}
		
		afficheListe(records);
		
		System.out.println("Select a record:");
		i = sc.nextInt();
		
	   if(records.get(i).isPerson()){
		   Personne p = (Personne) records.get(i);
		   System.out.println("Select a field (name, surname, birth, gender, number):");
		   champ = sc.nextLine();
		   sc.nextLine();
		   switch (champ) {
		   		case "name": System.out.println("Enter the name");
			       			 p.setNom(sc.nextLine());
		   		break;
		   		
		   		case "surname": System.out.println("Enter the surname");
		   						p.setPrenom(sc.nextLine());
		   		break;
		   		
		   		case "birth": System.out.println("Enter the birth");
					p.setDateN(sc.nextLine());
				break;
				
		   		case "gender": System.out.println("Enter the gender");
								p.setGenre(sc.nextLine());
				break;
	
		   		case "number": System.out.println("Enter the number");
		   					  p.setTel(sc.nextLine());
		   		break;


		       default:System.out.println("Unkown input");
		       break;
		}
		       records.add(i,p);
		       verif = true ;
	   }else{
		   
		   Organisation o = (Organisation) records.get(i);
		   System.out.println("Select a field (organisation name, adresse, number):");
		   champ = sc.nextLine();
		   switch (champ) {
		   		case "organisation name": System.out.println("Enter the organization name:");
		   		  						  o.setNom(sc.nextLine());
		   		break;
		   		
		   		case "adresse": System.out.println("Enter the adresse:");
		   						o.setAdresse(sc.nextLine());
			    break;
			    
		   		case "number": System.out.println("Enter the number:");
				              o.setTel(sc.nextLine());
			    break;

		   		default:System.out.println("Unkown input");
		   		break;
		}
			   records.add(i,o);
		       verif = true ;
	   }
	           return verif ;
	}

	@Override
	public int count() {
		
		return records.size();
	}

	@Override
	public Record info(int i) {
		
	/*	for(Record record : records){
			if(record.isPerson()){
				Personne p =(Personne)record ;
				System.out.println(p.toString());
			}
		}*/
		return null;
	}
 
	@Override
	public void exit() {
		
		
	}

	private void afficheListe(List<Record> r) {
		  for(Record record : records){
			if(record.isPerson()){
				Personne p = (Personne) record ;
				System.out.println(records.indexOf(record)+" "+p.toString());
			}else{
				Organisation o = (Organisation) record ;
				System.out.println(records.indexOf(record)+" "+o.toString());
			}
		  }
		
	}
}
