package org.test;

public class sample {
	public static void main(String[] args) {
		int a [][] = new int[4][4];
		
		
		a[0][0]= 1;
		a[0][1]= 2;
		a[0][2]= 3;
		a[0][3]=4;
		a[1][0]=5;
		a[1][1]=6;
		a[1][2]=7;
		a[1][3]=8;
		a[2][0]=9;
		a[2][1]=10;
		a[2][2]=11;
		a[2][3]=12;
		a[3][0]=13;
		a[3][1]=14;
		a[3][2]=15;
		a[3][3]=16;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j]);
				System.out.print(" ");
				
			}
			System.out.println(" ");
		}
	
	}			
}
