package alg;

public class reverse_int {
	
	public int reverse(int x) {
		if (x< Math.pow(2, -31) || x >= Math.pow(2, 31)) {
			return 0; 
		} else {
			System.out.println("given number: " + x);
	        int value = Math.abs(Integer.valueOf(x));
	        StringBuilder numbers = new StringBuilder(Integer.toString(value));
	        String resultString;
	        StringBuilder result =  new StringBuilder();
	        char[] reverse = numbers.reverse().toString().toCharArray();
	        int i;
	        for (i=0; i<reverse.length; i++){
	            if (reverse[i] != '0') {
	                for (int j=i; j<reverse.length; j++ ){
	                    result.append(reverse[j]);
	                }
	                break;
	            }
	        }
	        
	        if (x < 0){
	            resultString ="-" + result.toString(); 
	        } else if (x > 0)  {
	            resultString = result.toString();
	        } else {
	        	resultString = "0"; 
	        }
	        
	        return Integer.parseInt(resultString);
		}
        
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse_int rint = new reverse_int();
		System.out.println(rint.reverse(123));
		System.out.println(rint.reverse(1203));
		System.out.println(rint.reverse(1200));
		System.out.println(rint.reverse(12001));
		System.out.println(rint.reverse(-123));
		System.out.println(rint.reverse(-1200));
		System.out.println(rint.reverse(-12030));
		System.out.println(rint.reverse(-102030));
		System.out.println(rint.reverse(0));
		System.out.println(rint.reverse(-1));
		System.out.println(rint.reverse(-01));
		System.out.println(rint.reverse('a'));
		// the statement below will cause the errors due to the reversed number is 
		// 4281473701 which is over the range of signed int -2^31 to 2^31-1
		// need add extra block for handling the case
		// System.out.println(rint.reverse((int)Math.pow(2, 30)));

	}

}
