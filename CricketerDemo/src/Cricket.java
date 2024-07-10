
public class Cricket {
	Cricket(){
		System.out.println("Object is created");
	}
	protected void finalize() {
		System.out.println("object is destroyed");
	}

}
