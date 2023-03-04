package week1.day1;

public class IsPrime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=19;
		int count= 0;
		for (int i = 2; i<=n/2; i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
			if(count>1) {
				System.out.println(n +" is a Prime Number");
			}
			else {
				System.out.println(n +" is not a Prime Number");
		}
		
	}

	}
