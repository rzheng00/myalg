package alg;

public class Int_To_Roman {
	
	public String intToRoman (int num) {
		StringBuilder inRoman = new StringBuilder("");
		int startWith = 1000;
		
		if (num > Math.pow(2, 32) || num <= 0) {
			return "invalid integer";
		} else if (num >5000) {
			return "too large for Roman Numerals";
		} else {
			//1000s
			int thousand = num/1000;
			if (thousand >0) {
				for (int i=1; i<=thousand; i++) {
					inRoman.append("M");
				}
			}
			
			//100s
			int hundard = (num - thousand*1000)/100;
			
			if (hundard >0) {
				if(hundard == 9) {
					inRoman.append("CM");
				} else if(hundard >=5) {
					inRoman.append("D");
					for (int i=1; i<=hundard-5; i++) {
						inRoman.append("C");
					}
				} else if (hundard == 4){
					inRoman.append("CD");
				} else {
					for (int i=1; i<=hundard; i++) {
						inRoman.append("C");
					}
				}
			}
			
			//10s
			int ten = (num - thousand*1000 - hundard *100)/10;
			if (ten > 0) {				
				if (ten == 9) {
					inRoman.append("XC");
				} else if(ten >=5) {
					inRoman.append("L");
					for (int i=1; i<=ten-5; i++) {
						inRoman.append("X");
					}
				} else if (ten == 4){
					inRoman.append("XL");
				} else {
					for (int i=1; i<=ten; i++) {
						inRoman.append("X");
					}
				}
			}
			
			// 1s
			int one = (num - thousand*1000 - hundard *100 - ten *10);
			if (one>0) {
				if (one == 9) {
					inRoman.append("IX");
				} else if(one >=5) {
					inRoman.append("V");
					for (int i=1; i<= one-5; i++) {
						inRoman.append("I");
					}
				} else if (one == 4){
					inRoman.append("IV");
				} else {
					for (int i=1; i<= one; i++) {
						inRoman.append("I");
					}
				}
			}
		}
		
		
		return inRoman.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Int_To_Roman itr = new Int_To_Roman();
		System.out.println(itr.intToRoman(0));
		System.out.println(itr.intToRoman(1));
		System.out.println(itr.intToRoman(10));
		System.out.println(itr.intToRoman(100));
		System.out.println(itr.intToRoman(1000));
		System.out.println(itr.intToRoman(1001));
		System.out.println(itr.intToRoman(1010));
		System.out.println(itr.intToRoman(1100));
		System.out.println(itr.intToRoman(11));
		System.out.println(itr.intToRoman(101));
		System.out.println(itr.intToRoman(110));
		System.out.println(itr.intToRoman(1011));
		System.out.println(itr.intToRoman(1101));
		System.out.println(itr.intToRoman(1110));
		System.out.println(itr.intToRoman(1111));
		System.out.println(itr.intToRoman(4999));
		System.out.println(itr.intToRoman(6));
		System.out.println(itr.intToRoman(5));
		System.out.println(itr.intToRoman(4));
		System.out.println(itr.intToRoman(9));
		System.out.println(itr.intToRoman(14));
		System.out.println(itr.intToRoman(15));
		System.out.println(itr.intToRoman(16));
		System.out.println(itr.intToRoman(19));
		System.out.println(itr.intToRoman(44));
		System.out.println(itr.intToRoman(45));
		System.out.println(itr.intToRoman(46));
		System.out.println(itr.intToRoman(49));
		System.out.println(itr.intToRoman(41));
		System.out.println(itr.intToRoman(51));
		System.out.println(itr.intToRoman(61));
		System.out.println(itr.intToRoman(91));
		System.out.println(itr.intToRoman(114));
		System.out.println(itr.intToRoman(115));
		System.out.println(itr.intToRoman(116));
		System.out.println(itr.intToRoman(119));
		
	}

}
