package labs;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Student
		Student stu1 = new Student("Jin", "23424233");
		Student stu2 = new Student("Mark", "234564233");
		Student stu3 = new Student("Jackson", "237894233");
		stu1.enroll("Mat141");
		stu1.enroll("Eng324");
		stu1.enroll("Ssc234");
		
		stu1.checkBalance();
		stu1.showCourses();
		stu1.payTution(600);
		stu1.checkBalance();
		System.out.println(stu1.toString());
		
	}

}

class Student {
	// Properties
	private static int iD = 0;
	private String userID;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	public String getPhone() {
		return phone;
	}

	

	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setEmail();
		setUserID();
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "."  + iD + "@udemy.com";
		System.out.println("Your email: " + email);
	}
	
	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int randNum = (int)(Math.random() *(max - min));
		randNum = randNum + min;
		userID = iD + "" + randNum + ssn.substring(5);
		System.out.println("Your User ID: " + userID);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		System.out.println(courses);
		balance = balance + costOfCourse;
		
		
	}
	
	public void payTution(int amount) {
		balance = balance - amount;
		System.out.println("Payment: $" + amount);
		
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance) ;
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	public String toString() {
		return "[Name: " + name + "]\n[Courses: " + courses + " ]\n[Balance: " + balance + "]";
	}
}