package unit01;
import java.util.Scanner;

/*Create a switch statement [Manual], In Which:
a. When you pass 1 your program would print current year
b. When you pass 2 your program would print current month
c. When you pass 3 your program would print current day
d. When you pass 4 your program would print Not applicable 
* */

public class P7_SwitchStatements
{

	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
           System.out.println("Enter a number from 1 to 4 ");
		   Scanner input = new Scanner(System.in);
           int num= input.nextInt();

  switch(num){
  case 1: System.out.println("Current Year is 2022");
          break;
  case 2: System.out.println("Current Month is April");
          break;
  case 3: System.out.println("Current Day is Thrusday");
          break;
  case 4: System.out.println("Not applicable");
          break;
  default:
           System.out.println("Please enter correct input");

         }

		
	}
}
