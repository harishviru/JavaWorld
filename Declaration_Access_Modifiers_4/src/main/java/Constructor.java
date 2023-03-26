
public class Constructor {
	
	String name;
	int age;
	
public Constructor(String name,int age) {
	
	this.name=name;
	this.age=age;
}

	public static void main(String[] args) {
		
		Constructor ctr=new Constructor("Laxman", 60);
		
		
		System.out.println("Name : "+ctr.name+"  "+ "Age : "+ctr.age);
		
		
		
	}

}                


