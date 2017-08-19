import java.util.*;
class Test{
		public static void bubbleSortInt(int arr[],int len)
	{
		int temp;
		for(int i=0;i<=len;i++)
		{
			for(int j=1;j<=len-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<=len;k++)
		{
			System.out.println(arr[k]);
		}
	}


	}
class BubbleSort{
	public static void main(String...args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many int data you want to enter");
	int data=sc.nextInt();
	System.out.println("ENter your data");
	int[] str=new int[data];
	for(int i=0;i<data;i++)
	{
		 str[i]=sc.nextInt();
	}
	System.out.println("after sorting ");
	Test t=new Test();
	t.bubbleSortInt(str,str.length-1);
	
	
	}
}
