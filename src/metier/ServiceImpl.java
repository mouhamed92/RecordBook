package metier;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entite.Organisation;
import entite.Personne;
import entite.Record;


public class ServiceImpl implements IService {
	
	List<Record> records ;
	String typeR ;
    Scanner sc = new Scanner(System.in);
    
	public ServiceImpl() {
	 
		records = new ArrayList<Record>();
	}

	@Override
	public boolean add() {
		
		System.out.println("Enter the type (person, organization):");
		typeR = sc.nextLine();
		
		if(typeR.equals("person")){
			
			Personne p = new Personne();
			p.setNom(p.getNom());
			p.setPrenom(p.getPrenom());
			p.setTel(p.getTel());
			p.setPerson(true);
			p.setDateN(p.getDateN());
			p.setGenre(p.getGenre());
			
			return records.add(p);
			
		}else if(typeR.equals("organization")){
			
			Organisation o = new Organisation();
			o.setNom(o.getNom());
			o.setAdresse(o.getAdresse());
			o.setTel(o.getTel());
			o.setPerson(false);
			
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
			System.out.println("Select a record:");
			int i = sc.nextInt();
		    records.remove(i);
		    
		    return true ;
		}	
	}

	@Override
	public boolean edit(int i) {
		
		return false;
	}

	@Override
	public int count() {
		
		return 0;
	}

	@Override
	public Record info(int i) {
		
		return null;
	}

	@Override
	public void exit() {
		
		
	}

}
