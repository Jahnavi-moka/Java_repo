package Interviewprograms;

public class Fibonacci {

	public static void main(String[] args) {
		int D =10;
		int n1 = 0;
		int n2=1;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<D;i++) {
		 int n3 = n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;

	}

}
}