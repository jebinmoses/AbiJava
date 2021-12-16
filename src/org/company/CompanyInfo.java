package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println(" Company Name : Greens");
		 
		
	}
	private void companyName(int id,String name) 
	{
		System.out.println(" Company id :" +id);
		System.out.println(" Company Name:" +name);
		
	}
	private void companyName(double avg, float sal)
	{
		System.out.println(" Avg:" +avg);
		System.out.println("Salary:" +sal);
	}
		
	
	private void companyName(String location,long ph,int id) {
		System.out.println("Company Location:" +location);
		System.out.println("Company ph no:" +ph);
		System.out.println("company id:"+id);
		
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyName( 546, "Greens Tech");
		c.companyName( 56.45, 25000f);
		c.companyName( "perumbakkam", 67354674849l, 8939);
		
	}
}
