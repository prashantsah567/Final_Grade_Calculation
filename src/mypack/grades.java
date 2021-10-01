package mypack;
//importing the Scanner class to take user input
import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the grade for your 5 program project: ");
		//declaring variable for grade of project
		double n1,n2,n3,n4,n5;
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		n3 = input.nextDouble();
		n4 = input.nextDouble();
		n5 = input.nextDouble();
		
		System.out.println("Enter the grade of two quizzes: ");
		//declaring variables for grades of quiz
		double q1,q2;
		q1 = input.nextDouble();
		q2 = input.nextDouble();
		
		System.out.println("Enter the grade of two tests: ");
		//declaring variables for grades of tests
		double t1,t2;
		t1 = input.nextDouble();
		t2 = input.nextDouble();
		
		System.out.println("Enter the final exam grade: ");
		//declaring variable for final exam grade input
		double f;
		f = input.nextDouble();
		//calculating the average of all grades
		double avg = (((n1+n2+n3+n4+n5)/500)*20) + (((q1+q2)/200)*10) + (((t1+t2)/200)*30) + ((f/100)*40);
		
		//printing the final result
		System.out.println("The final grade of the student is: "+ avg);
	}

}
