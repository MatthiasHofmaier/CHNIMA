
public class Tisch {
	
	String name="";
	
	Tisch(String name){
		this.setName(name);
	}

	public void setName(String name){
		this.name=name;
	}
	
	@Override
	public String toString(){
	return this.name;
	}
}
