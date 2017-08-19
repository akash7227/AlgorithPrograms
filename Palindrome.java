import java.util.*;
class Palindrome{
	public static void main(String...args)
	{
	int temp,plus=0,check=0;
	int[] arr=new int[1000];
	int[] brr=new int[1000];
		
	for(int i=0;i<1000;i++)
	{
		int d=0;
		if(i==0 || i==1)
		{
			d=1;
		}
	
		for(int j=2;j<i;j++)
		{
			
			 if(i%j==0 || i==0 || i==1)
			{
				 d=1;
				break;			
			}
			
		}
	
		if(d==0)
		{
		plus++;
		
		arr[plus]=i;


			
		}
	}


			
		System.out.println("Palindrome no. is  ");
		
		for(int k=1;k<plus;k++)
	
		{
			int b=0;int sum1=0;
			int dd=0;
			b=arr[k];
			check=b;

			while(b>0)
			{
				dd=b%10;
				sum1=(sum1*10)+dd;
				b=b/10;
			
			}

			if(check==sum1)
			{
				System.out.println(sum1);
			
			}
		}


		for(int l=1;l<plus;l++)

		{
			String data=String.valueOf(arr[l]);
			char[] c1=data.toCharArray();
			Arrays.sort(c1);
			String data1=String.valueOf(c1);
			
			brr[l] = Integer.parseInt(data1);
			
			
					
			
		}
		System.out.println("All possible combination of Anagram");
		for(int p=1;p<plus;p++)
		{

			for(int m=p+1;m<plus;m++)
			{
			
				if(brr[p]==brr[m])
				{
					int length = (int)(Math.log10(arr[p])+1);
					int length1 = (int)(Math.log10(arr[m])+1);					
					//System.out.print(" I" +p+"value "+brr[p]);
					//System.out.println("J"+m+"value"+brr[m]+"real value "+arr[m]);
					if(length==length1)
					{					
					System.out.print(arr[p]+" "+arr[m]+" ");
					//System.out.println();

					}



				}
			}	
		}





		
}
}
