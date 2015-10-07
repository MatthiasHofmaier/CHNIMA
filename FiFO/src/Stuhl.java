
public class Stuhl {

	String name="";
	
	Stuhl(String name){
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