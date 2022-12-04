import java.util.Arrays;
import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		
		
		int [] a = {10,20,30,50,60,20};
		
		boolean flag = false;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Found duplicate element :"+a[i]);
					flag = true;
					break;
				}
			}
		}
		if (flag == false)
		{
			System.out.println("Duplicate element not found ");
		}
		

	}

}
