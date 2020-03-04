package presentation;

import java.util.Scanner;
import metier.ServiceImpl;

public class Test {

	public static void main(String[] args) {
		String choix ;
		ServiceImpl service = new ServiceImpl() ;
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("Enter action (add, remove, edit, count, info, exit):");
		choix = sc.nextLine();
		switch (choix) {
		case "add": service.add();			
		break;
		case "remove": service.remove();			  
		break;
		
		case "edit": service.edit();			
		break;
		
		default:
			break;
		}
		}
		
	}
}
