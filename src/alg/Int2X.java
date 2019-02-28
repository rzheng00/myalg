package alg;

public class Int2X {
	public static String convert2Binary(String num) {
		int i = Integer.parseInt(num);
		if (i<=1) {
			return num;
		}
		return convert2Binary(String.valueOf(i/2)) + convert2Binary(String.valueOf(i%2));
	}
	
	public static String convert2Hex(String num) {
		int i = Integer.parseInt(num);
		if (i<=15) {
			switch (i){
				case 15: num="f"; break;
				case 14: num="e"; break;
				case 13: num="d"; break;
				case 12: num="c"; break;
				case 11: num="b"; break;
				case 10: num="a"; break;
			}
			return num;
		}
		return convert2Hex(String.valueOf(i/16)) + convert2Hex(String.valueOf(i%16));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		System.out.println(Int2X.convert2Binary("2"));
		System.out.println(Int2X.convert2Binary("3"));
		System.out.println(Int2X.convert2Hex("1"));
		System.out.println(Int2X.convert2Hex("2"));
		System.out.println(Int2X.convert2Hex("3"));
		System.out.println(Int2X.convert2Hex("4"));
		System.out.println(Int2X.convert2Hex("5"));
		System.out.println(Int2X.convert2Hex("6"));
		System.out.println(Int2X.convert2Hex("7"));
		System.out.println(Int2X.convert2Hex("8"));
		System.out.println(Int2X.convert2Hex("9"));
		System.out.println(Int2X.convert2Hex("10"));
		System.out.println(Int2X.convert2Hex("11"));
		System.out.println(Int2X.convert2Hex("12"));
		System.out.println(Int2X.convert2Hex("13"));
		System.out.println(Int2X.convert2Hex("14"));
		System.out.println(Int2X.convert2Hex("15"));
		System.out.println(Int2X.convert2Hex("16"));
		System.out.println(Int2X.convert2Hex("20"));
		System.out.println(Int2X.convert2Hex("30"));
		System.out.println(Int2X.convert2Hex("1100"));
		System.out.println(Int2X.convert2Hex("0"));
	}

}
