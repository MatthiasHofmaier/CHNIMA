
import java.util.ArrayList;

public class FiFo {
	
	ArrayList<Object> list;
	String name;
	
	public FiFo(String name){
		setName(name);
		list=new ArrayList<>();
		
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void push(Object o){
		this.list.add(o);
	}
	
	public void pull(){
		this.list.remove(list.size()-1);
	}
	
	@Override
	public boolean equals(Object o){
		if(o!=null){
		
		if(o instanceof FiFo){
			FiFo b=(FiFo)o;
		 return(this.list.equals(b.list));
		}
		}
		return false;
	}

	@Override
public Object clone(){
		Object o=null;
		try{
		o=super.clone();
		}
		catch(CloneNotSupportedException e){
			
		}
		return o;
		}
	
	

	@Override
	public String toString(){
	return list.toString();
	}
}
