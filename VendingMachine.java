import java.util.*;
class VendingMachine{
	public static void main(String...args)
	{
	int d1=0,d2=0,d5=0,d10=0,d50=0,d100=0,d500=0,d1000=0,temp=0,data1,data2,data3,data4,data5,data12,data15;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int data=sc.nextInt();
	 temp=data;
	while(data>0)
	{	
		
		if(data==1)
		{
				d1=data;
				break;
		}
		else if(data>=2 && data<=4)
		{
				data12=data/2;
				d2=data12;
				data=(data-(d2*2));
		}
		else if(data>=5 && data<=9)
		{
				data15=data/5;
				d5=data15;
				data=(data-(d5*5));
		}
		
		else if(data>=10 && data<=49)
		{
				data1=data/10;
				d10=data1;
				data=(data-(d10*10));
				
		}
		else if(data>=50 && data<=99)
		{
				data2=data/50;
				d50=data2;
				data=(data-(d50*50));
				
		}
		else if(data>=100 && data<=499)
		{
			data3=data/100;
			d100=data3;
			data=(data-(d100*100));
			
		}
		else if(data>=500 && data<=999)
		{
			data4=data/500;
			d500=data4;
			data=(data-(d500*500));
			
		}
		else if(data>1000)
		{
			data5=data/1000;
			d1000=data5;
			data=(data-(d1000*1000));
			
		}
	}
	System.out.println("1 Note "+d1+"\n2 Note "+d2+"\n5 Note "+d5+"\n10 Note "+d10+"\n50 Note "+d50+"\n100 Note "+d100+"\n500 Note " +d500+"\n1000 Note "+d1000+"\nYour Money is : "+temp);
	}
}
