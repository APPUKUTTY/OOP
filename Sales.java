package emp;
import java.util.Scanner;
public class Sales {
	Scanner shakthi=new Scanner(System.in);
	int c;
	int[] salesSal;
	int[] counters=new int[9];
	public void set()
	{
		System.out.println("Enter the size of the array");
		c=shakthi.nextInt();
		salesSal=new int[c];
	}
	public void setData()
	{
		System.out.println("Enter the sales grosses for all the emplyees");
		for(int i=0;i<salesSal.length;i++)
		{
			salesSal[i]=shakthi.nextInt();
		}
	}
	public void calc()
	{
		for(int i=0;i<salesSal.length;i++)
		{
			salesSal[i]=(int) (200+(0.09)*salesSal[i]);
				
		}
	}
	public void classify()
	{
		for(int k=0;k<counters.length;k++)
			counters[k]=0;
		for(int j=0;j<salesSal.length;j++)
		{
			if((salesSal[j]>=200) && (salesSal[j]<300))
				counters[0]++;
			else if((salesSal[j]>=300) && (salesSal[j]<400))
				counters[1]++;
			else if((salesSal[j]>=400) && (salesSal[j]<500))
				counters[2]++;
			else if((salesSal[j]>=500) && (salesSal[j]<600))
					counters[3]++;
			else if((salesSal[j]>=600) && (salesSal[j]<700))
					counters[4]++;
			else if((salesSal[j]>=700) && (salesSal[j]<800))
					counters[5]++;
			else if((salesSal[j]>=800) && (salesSal[j]<900))
					counters[6]++;
			else if((salesSal[j]>=900) && (salesSal[j]<1000))
					counters[7]++;
			else counters[8]++;
		}
		System.out.println("200-299 300-399 400-499 500-599 600-699 700-799 800-899 900-999 1000&over");
		for(int k=0;k<counters.length;k++)
				System.out.printf("   "+counters[k]+"    ");
		
		}
		
	
	public static void main(String[] args) {
	Sales s1=new Sales();
	s1.set();
	s1.setData();
	s1.calc();
	s1.classify();
	
	
	
	
	
	
	
	
	
	}

}
