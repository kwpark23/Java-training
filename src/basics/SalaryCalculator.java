package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Let's create a variable to define our career
		
		// Declare a variable
		String career = "Software Developer";
		System.out.println("Program is staring");
		System.out.println("My career is: " + career);
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $"
				+ rate + " per hour is $" + salary + " per year.");
		// Computer our annual salary
		// rate * hoursPerWeek * weeksPerYear
	}
}
