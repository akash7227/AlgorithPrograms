import java.util.*;

class Test{
	public static void insertionSortString(String srr[],int len)
	{
		String temp;
		int j;
		for(int i=1;i<=len;i++)
		{
			temp=srr[i];
			j=i-1;
			while(j>=0 && srr[j].compareTo(temp)>0)
			{
				srr[j+1]=srr[j];
				j=j-1;
			}
			srr[j+1]=temp;
		
		}
		for(int k=0;k<=len;k++)
		{
			System.out.println(srr[k]);
		}
	}
}

class InsertionSort{
	public static void main(String...args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many words you want to enter");
	int data=sc.nextInt();
	System.out.println("ENter your data");
	String[] str=new String[data];

	for(int i=0;i<data;i++)
	{
		 str[i]=sc.next();
	}


	Test u=new Test();

	System.out.println("after sorting ");
	u.insertionSortString(str,data-1);
	
}
}
