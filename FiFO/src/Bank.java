
public class Bank {


	String name="";
	
	Bank(String name){
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

