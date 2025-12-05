import java.util.Scanner;
import java.lang.Math;

public class TurtleAge {
	   public static void main(String[] args) {
		      Scanner scnr = new Scanner(System.in);
		      
		      Turtle myTurtle = new Turtle();

		      System.out.println("Enter Turtle's Age: ");
		      int age = scnr.nextInt();
		      System.out.println("Enter Turtle's Shell Strength: ");
		      int shellStrength = scnr.nextInt();
		      
		      myTurtle.setAge(age);
		      myTurtle.setShellStrength(shellStrength);
		      myTurtle.calcShellStrength();
		      
		      myTurtle.printInfo();
		   }
		
}
