package trainee;
import employee.Employee;
import java.util.Scanner;


public class Trainee extends Employee
{
    int workinghrs, rate,TA,x;
    //default constructor
    public Trainee()
    {
        Scanner get = new Scanner(System.in);
        System.out.println("Enter Number of Working Hours:");
        workinghrs = get.nextInt();
    }
    public void calculatepay()
    {
        rate = 8 * workinghrs;
        x = rate*50;
        TA=(10*x/100);        
    }
    public void display()
    {
        System.out.println("=============================="+"\n"+"Trainee Details"+"\n"+"=============================="+"\n");
        super.display();
        System.out.println("Number of Working Hours: "+workinghrs);
        System.out.println("Salary for "+workinghrs+" working hours is: $"+rate);
        System.out.println("Travel allowance"+TA);
    }
}