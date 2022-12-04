import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int ar [] = {90,50,30,80,20,10};
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar.length-1; j++)
			{
				if(ar[j]>ar[j+1])
				{
					int emp;
					emp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=emp;
				}
			}
		}
		
		System.out.println(Arrays.toString(ar));
	}

}
