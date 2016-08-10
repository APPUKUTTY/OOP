package emp;
import java.util.Scanner;

public class Employee {
	String firName,lastName;
	double monSal;
	public Employee(String a,String b,double c)
	{
		firName=a;
		lastName=b;
		if(c>=0)
			monSal=c;
	}
	public Employee() {
		
	}
	Scanner input=new Scanner(System.in);
	public void setFir()
	{
		System.out.println("Enter the firstname");
		firName=input.next();
	}
	public String getFir()
	{
		return this.firName;
	}
	public void setLas()
	{
		System.out.println("Enter the lastname");
		lastName=input.next();
	}
	public String getLas()
	{
		return this.lastName;
	}
	public void setSal()
	{
		System.out.println("enter the mon.salary");
		double d=input.nextDouble();
		if(d>=0)
			monSal=d;
	}
	public double getSal()
	{
		return this.monSal;
	}
	public void rise()
	{
		monSal=monSal+(0.1)*monSal;
	}

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setFir();
		e1.setLas();
		e1.setSal();
		Employee e2=new Employee("Pavii","Eugene",12000);
		System.out.println("yearly salary of e1 is"+e1.monSal*12+" and yearly salary of e2 is"+e2.monSal*12);
		e1.rise();
		e2.rise();
		System.out.println("now yearly salary of e1 is"+e1.getSal()*12+" and yearly salary of e2 is"+e2.getSal()*12);
		
		
	}

}
