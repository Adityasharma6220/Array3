package Aditya;
import java .util.Scanner;
public class Store2 {

	public static void main(String[] args) {
		Scanner arr=new Scanner(System.in);
		    int[][]aditya=new int[2][2];
for(int i=0;i<aditya.length;i++) 
	{
	for(int j=0;j<aditya[i].length;j++) {
		System.out.println("Enter the Class " + i+ " Student " + j);
	aditya[i][j]=arr.nextInt();
	}
	
}
System.out.println("Marks are as Follows ");
for(int i=0;i<aditya.length;i++) 
{
for(int j=0;j<aditya[i].length;j++) {
	System.out.print(aditya [i] [j]);

}
System.out.println();
}
	}

}
