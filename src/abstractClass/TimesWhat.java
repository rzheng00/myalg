package abstractClass;

public class TimesWhat extends Product {
	

	public TimesWhat() {
		super(2);
		System.out.println("init in concrete");
	}
	
	public void mutiply(int t, int g) {
		System.out.println(t *g);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TimesWhat p = new TimesWhat();
		
		System.out.println("Product is " + p.mutiply(10));
		
		p.mutiply(10, 3);
	
	}

}
