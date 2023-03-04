package week1.day1;

public class Fibboniocc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum=0, secnum=1, sum=0, count=10;
		System.out.println(firstnum);
		for (int i=2;i<=count;i++) {
			sum= firstnum + secnum;
			firstnum=secnum;
			secnum=sum;
			System.out.println(sum);
			}			
		}
	}

