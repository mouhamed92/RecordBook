package metier;
import entite.Record;

public interface IService {
	
	public boolean add();
	public boolean remove();
	public boolean edit(int i);
	public int count();
	public Record info(int i);
	public void exit();

}
