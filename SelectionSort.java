import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] ar = {38,52,9,58,6,57,13};
		
		int min=1;
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[j]<ar[min])
				{
					min=j;
				}
			}
			int emp=ar[i];
			ar[i]=ar[min];
			ar[min]=emp;
		}
		/*for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}*/
		System.out.println(Arrays.toString(ar));

	}

}
