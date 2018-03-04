package basics;
//array is just like a list
public class Cities {

	public static void main(String[] args) {
		String[] cities = {"NY", "SF", "Dallas", "Miami"};
		System.out.println(cities[0]);
		
		
		String[] states = new String[2];
		states[0] = "CF";
		states[1] = "Ohio";
		int i = 0;
		
		// Do loop
		do {
			System.out.println(states[i]);
			i = i + 1;
		} while (i < 2);
		
		// While loop
		int n = 0;
		while (n <=1 ) {
			System.out.println(states[n]);
			n++;
		}
		
		// for loop
		for (int x = 0; x < 2; x++) {
			System.out.println(states[x]);
		}
	}

}
