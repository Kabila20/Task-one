package Training;
import java.util.*;
public class LargestNumberDemo2 {
	public static void main(String[] args)
	{
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number count");
		int n=obj.nextInt();
		System.out.println("Enter array numbers:");
		
		ArrayList<Integer> number=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int a =obj.nextInt();
			number.add(a);
		}
		
		
		int max = number.get(0);
		
	for (int i=0; i<number.size();i++)
		{
			
			if(number.get(i) > max)
			{
				max = number.get(i);
			}
		}
		System.out.println("Max no is:" + max);
		
	}

}
