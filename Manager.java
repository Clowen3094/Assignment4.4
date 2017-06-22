/* Manager class inheriting some common features of Employee class
   and adding some of its own 
 */
package manager;
import employee.Employee;
import java.util.Scanner;
public class Manager extends Employee
{
	    int salary,TA;
	    //default constructor
	   public Manager()
	    {
                Scanner get = new Scanner(System.in);
	        System.out.println("Enter Salary:");
	        salary = get.nextInt();
	        TA=(15*salary/100);
	    }
	    public void display()
	    {
	        System.out.println("=============================="+"\n"+"Manager Details"+"\n"+"=============================="+"\n");
	        super.display();
	        System.out.println("Salary: "+salary);
	        System.out.println("Travel allowance: "+TA);
	    }
}