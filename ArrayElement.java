import java.util.Scanner;

public class ArrayElement {

	public static void main(String[] args) {
		try
		{
			int arr[],size;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Array Size: ");
			size= sc.nextInt();
			arr=new int[size];
			System.out.println("Enter Elements: ");
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			int index;
			int element;
			System.out.println("Enter the Index");
			index=sc.nextInt();
			element=arr[index];
			System.out.println("Element at index: "+index+"="+element);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Wrong Index");
		}
		finally
		{
			System.out.println("completed");// haa bhai haa
		}

	}

}
