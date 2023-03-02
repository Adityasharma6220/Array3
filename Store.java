package Aditya;
import java.util.Scanner;
public class Store {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][][]aditya=new int[2][][];
		aditya[0]=new int[2][3];
		aditya[1]=new int[3][2];
		for(int i=0;i<aditya.length;i++)
		{
		for( int j=0;j<aditya[i].length;j++)
			{
			
			for(int k=0;k<aditya[i][j].length;k++)
	{
		System.out.println("Enter the marks of college " +i+ " class " +j+ " student "+k );
             aditya[i][j][k]=scan.nextInt();	
					}
			}
		}
		System.out.println("Marks are stored as");
		for(int i=0;i<aditya.length;i++)
		{
		for( int j=0;j<aditya[i].length;j++)
			{
			
			for(int k=0;k<aditya[i][j].length;k++)
	{
		System.out.print(aditya[i][j][k] );
             	
					}
			System.out.println();
			}
		}
	}
}


