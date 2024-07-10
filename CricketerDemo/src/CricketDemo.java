
public class CricketDemo {

	public static void main(String[] args) {
		
		//ways of garbage collection
		
		Cricket c = new Cricket();
		c = null;  //1. assigning the unreferenced to null
		
		
		
		Cricket c1 = new Cricket();
		Cricket c2 = new Cricket();
		c1=c2;  //2. assigning the unreferenced to another
		
		new Cricket(); //3. anonymous object
		
		System.gc(); //method used to invoke garbage collector to do garbage collection
		

	}

}
//four objects created but three destroyed