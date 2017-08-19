import java.util.*;
class Prime{
	public static void main(String...args)
	{
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
		System.out.print(" "+i);
		}
	}
	
	}
}
