package Interviewprograms;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=4; 
		int star = 0;
		for(int i=1;i<=4;i++) {
			space--;
			star ++;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.println();
			}
		}

	}

