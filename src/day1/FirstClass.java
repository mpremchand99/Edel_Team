package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class FirstClass {
	// Human prem=new Human()
	// Human kiran=new Human()
	// Human ajay=new Human()
	public static void main(String[] args) {
		int x;
		Dog d1=new Dog();  // d1 is representative of Dog Class
		d1.name="tommy";
		d1.color="White";
		d1.wt=5.0;
		d1.bark();
		d1.getDetails();

		
		Dog d2=new Dog();  // d1 is representative of Dog Class
		d2.name="tiger";
		d2.color="Black";
		d2.wt=4.0;
		d2.bark();
		d2.getDetails();

		/*WebDriver is Parent
		ChromeDriver, FirefoxDriver, OperaDriver are Child
					
		WebDriver driver=new FirefoxDriver();   // Parent p=new CHild
		
		ChromeDriver driver=new Opera();*/
		
	//	WebDriver driver=new OperaDriver();
		
		//ChromeDriver driver=new ChromeDriver(); // Child c=new Child
		
		
	/*	HSSFWorkBook wb=new HSSFWookBook();  // .xls
		XSSFWorkBook wb=new XSSFWookBook();  // .xlsx
		
		WorkBook wb=new 
				*/
	}
}


//Short Note
class Dog {
	String color, name,h;
	double wt;

	public void bark() // round braces means it is method > Method Declare
	{ // Method's Body or Implementation Part
		System.out.println("Dog is Barking");
	}
	
	

	public void getDetails() {
		System.out.println("name is "+name);
		System.out.println("Color is "+ color);
		System.out.println("Weight is "+wt);
	}
}
