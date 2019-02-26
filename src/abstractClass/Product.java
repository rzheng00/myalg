package abstractClass;

public abstract class Product {
	int multiplyBy;
	public Product( int multiplyBy ) {
		this.multiplyBy = multiplyBy;
		System.out.println("init in abstract");
    }

    public int mutiply(int val) {
    	return multiplyBy * val;
    }
}
