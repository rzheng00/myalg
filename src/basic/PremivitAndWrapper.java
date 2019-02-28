package basic;

public class PremivitAndWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(10);
		System.out.println(i.toString());
		System.out.println(i.doubleValue());
		System.out.println(i.compareTo(new Integer(11)));
		System.out.println(i.compareTo(new Integer(10)));
		System.out.println(i.compareTo(new Integer(9)));
		
		System.out.println(i.floatValue());
		System.out.println(i.hashCode());
		System.out.println(Integer.parseInt("-100"));
		System.out.println(Integer.parseInt("10"));
		System.out.println(Integer.parseInt("007910"));
		System.out.println(i.byteValue());
		System.out.println(i.getClass());
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.reverse(203));
		System.out.println(Integer.compare(100, 20));
		System.out.println(Integer.toBinaryString(203));
		System.out.println(Integer.toBinaryString(Integer.reverse(203)));
		
		System.out.println(Integer.parseInt("11001011", 2));
		System.out.println(Integer.parseInt("11", 16));
		
		String s = null;
		System.out.println(s+"a");
			
	}

}
