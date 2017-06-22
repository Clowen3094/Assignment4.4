/* Employees class for creating object and accessing all the features of
   Manager and Trainee class Separately 
 */
import employee.Employee;
import manager.Manager;
import trainee.Trainee;
class Employees
{
    public static void main(String args[])
    {
        System.out.println("================================"+"\n"+"Enter Manager Details"+"\n"+"================================"+"\n");
        Manager ob1 = new Manager();       
        System.out.println("================================"+"\n"+"Enter Trainee Details"+"\n"+"================================"+"\n");
        Trainee ob = new Trainee();
        ob1.display();
        ob.calculatepay();
        ob.display();
    }
}