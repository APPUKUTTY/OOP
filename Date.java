package emp;
import java.util.Scanner;

public class Date {
	int month,day,year;
	public Date(int a,int b,int c)
	{
		month=a;
		day=b;
		year=c;
	}
	public Date() {
		
	}
	Scanner input=new Scanner(System.in);
	public void setMonth()
	{
		System.out.println("Enter the month");
		month=input.nextInt();
	}
	public int getMonth()
	{
		return this.month;
	}
	public void setDay()
	{
		System.out.println("Enter the day");
		day=input.nextInt();
	}
	public int getDay()
	{
		return this.day;
	}
	public void setYear()
	{
		System.out.println("enter the year");
		year=input.nextInt();
	}
	public int getYear()
	{
		return this.year;
	}
	public void displayDate()
	{
		System.out.println("The date is "+month+"/"+day+"/"+year);
	}
	public static void main(String[] args) {
		
		Date d1=new Date();
		d1.setMonth();d1.setDay();d1.setYear();
		Date d2=new Date(4,6,2014);
		d1.displayDate();
		d2.displayDate();
	}

}
