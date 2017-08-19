import java.util.*;
import java.lang.*;
import java.io.*;

class FindNumber
{	
	public static void main(String args[])
	{
		
		int n=Integer.parseInt(args[0]);
		//System.out.println("with in "+n+ " tim");
		int l=0,h;
		h=(int)Math.pow(2,n)-1;
		System.out.println("you data will be "+l+" to "+h);
		int p=guessnum(l,h);
		System.out.println(p + " " + "is the number");

	}


	static int guessnum(int l,int h)
	{
		Scanner sc=new Scanner(System.in);
		if((h-l)==1)
			return l;
		int m=(l+h)/2;
		System.out.println("your data is between" + l+" " + m );
		String opt=sc.next();
		if(opt.equalsIgnoreCase("y"))
		{
			return guessnum(l,m);
		}
		else
		{
			return guessnum(m+1,h);
		}
	}
}


