package basics;

public class Weather {
	public static void main(String[] args) {
		int temperature = 67;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirts");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler.");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day, make sure to wear warmer clothes.");
		}
		else {
			System.out.println("Bring a sweater");
		}
	}
}
