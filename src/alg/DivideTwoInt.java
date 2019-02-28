package alg;

public class DivideTwoInt {
	
	public int calculate(int dividend, int dividsor) {
		int remain = Math.abs(dividend);
		int count = 0;
//		if (dividend < dividsor) {
//			return 0;
//		} else {			
			for (count=0; remain > Math.abs(dividsor); count++) {
				remain = remain - Math.abs(dividsor);
			}
			return ((dividend>0 && dividsor>0) || (dividend<0 && dividsor<0))?count: 0-count;
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DivideTwoInt dti = new DivideTwoInt();
		System.out.println(dti.calculate(10, 3));
		System.out.println(dti.calculate(10, 2));
		System.out.println(dti.calculate(101, 11));
		System.out.println(dti.calculate(3, 10));
		System.out.println(dti.calculate(-10, 3));
		System.out.println(dti.calculate(1001, -12));

	}

}
