import java.util.Scanner;
public class IT24104167Lab3Q2 {
	public static void main(String[]args){
		//Declare Variables
		double monthlySalary, otHours, otHourlyRAte, otAmount, totalSalary;
		
		//Create Scanner class
		Scanner input = new Scanner(System.in);
		
		//Take priceperkg and quantity as user input
		System.out.print("Enter the Monthly Salary :");
		monthlySalary = input.nextDouble();
		System.out.print("Enter the OT Hours :");
		otHours = input.nextDouble();
		System.out.print("Enter the OT Hourly Rate :");
		otHourlyRAte = input.nextDouble();
		
		//Calculation
		otAmount = otHours * otHourlyRAte;
		totalSalary = monthlySalary+otAmount;
		
		//Display output
		System.out.println("The Total Salary is:"+ totalSalary);
	
	}
}