package emp;
import java.util.*;
public class Duplicate {
	int[] values=new int[5];
	int n;
	Scanner input=new Scanner(System.in);
	public Duplicate()
	{
		n=0;
	}
	
	public void push(int b)
	{	
		int i;
		for(i=0;i<n;i++)
		{
			if(values[i]==b)
				return;
		}
		values[i]=b;
		n++;
	}	
	public void ini()
	{
		for(int i=0;i<5;i++)
			values[i]=0;
	}
	public void display()
	{
		for(int i=0;i<n;i++)
			System.out.println(values[i]);
	}
	public void setdata()
	{
		int d = 0;
		System.out.println("Enter the 5 values from 10 to 100");
		for(int k=0;k<5;k++)
		{
			d=input.nextInt();
			push(d);
			display();
		}
		}
	public static void main(String[] args) {
		Duplicate d1=new Duplicate();
		d1.ini();
		d1.setdata();
		
		

	}

}
