package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=33;
		boolean prime= false;
		for (int i = 2; i<=n/2; i++) {
			if(n%i==0) {
				prime= true;
				break;
			}
		}
			if(!prime) {
				System.out.println(n +" is a Prime Number");
			}
			else {
				System.out.println(n +" is not a Prime Number");
		}
	}
}
