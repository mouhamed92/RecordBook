package metier;
import entite.Record;

public interface IService {
	
	public boolean add(Record o);
	public boolean remove(int i);
	public boolean edit(int i);
	public int count();
	public Record info(int i);
	public void exit();

}
