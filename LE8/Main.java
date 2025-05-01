public class Main
{
	public static void main(String[] args) {
		Crow crow = new IndianCrow();
		CrowAdapter crowadpater = new CrowAdapter(crow);
		client(crowadpater);
	}
	
	public static void client(Swan swan){
	    swan.eat();
	    swan.swim();
	    swan.sing();
	}
}
