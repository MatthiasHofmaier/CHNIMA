
public class Test {

	public static void main(String[] args) {

		//Objekte einkaufen
		
		FiFo list1=new FiFo("liste1");
		Stuhl stuhl1=new Stuhl("stuhl1");
		Tisch tisch1=new Tisch("tisch1");
		
		list1.push(tisch1);
		list1.push(stuhl1);
	
		
		FiFo list2=list1.clone();

		
		
		
		System.out.print(list1.toString());
		System.out.print(list1.equals(list2)); 


		
		
	}

}
