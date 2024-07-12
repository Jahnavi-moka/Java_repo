package Interviewprograms;

public class Suarepa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int star=0;
		for(int i=1;i<=star;i++) {
			if(i<=4) {
				star++;
			}
			else {
				star--;
			}
			for(int j=1;j<=7;j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		}



	}*/
		int space=3;
		int star=-4;
		for(int i=1;i<=3;i++) {
			if(i<=3) {
				space--;
			}
			else {
				space++;
			}
		}
		for(int j=1;j<=space;j++) {
			System.out.print("");
			if(j<=2) {
				star+=5;
			}
			else if(j==3) {
				star ++;
			}
			else if(j==4) {
				star--;
			}
			else {
				star-=5;
			}
		}
			for(int k=1;k<=star;k++) {
				System.out.println("*");
			}
			System.out.print("");
		}
				
			}

		

