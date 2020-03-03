package metier;

import static org.junit.Assert.*;

import org.junit.Test;

import entite.Organisation;
import entite.Personne;
import entite.Record;

public class ServiceImplTest {

	boolean resultat ;
	ServiceImpl service = new ServiceImpl();
	
	@Test
	public void AjoutRecord() {
		
		
		Personne p = new Personne();
		p.setNom("mohamed");
		p.setPrenom("hammami");
		p.setTel("22251382");
		p.setDateN("07/06/1992");
		p.setPerson(true);
		p.setGenre("men");
	   
		resultat = service.add();
		
		assertEquals(true, resultat);
		
		Organisation o = new Organisation();
		o.setNom("pizza hot");
		o.setAdresse("lac 2");
		o.setTel("71845975");
		o.setPerson(false);
		
		resultat = service.add();
		
		assertEquals(true, resultat);
	
	}
	
	@Test
	public void Remove(){
		
		int i = 1 ;
		service.records.add(new Organisation("pizz", "", false, ""));
		resultat = service.remove();
		
		assertEquals(true, resultat);
	}

}
