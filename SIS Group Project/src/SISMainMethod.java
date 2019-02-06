
import java.io.IOException;

import java.util.Scanner;


public class SISMainMethod
	{

		static boolean run = true;
		public static void main(String[] args) throws IOException

			{
				DataBase.fillArray();
				Scanner userInput = new Scanner(System.in);
				
				System.out.println("Welcome to Blake, Danny, and Kenny's Student Information System.");
				
				while(run)
					{
				System.out.println("What would you like to do?");
				System.out.println("(1) Add or Delete a Student.");
				System.out.println("(2) Change Student Grades or Schedules.");
				System.out.println("(3) Sort Students");
				int userChoice = userInput.nextInt();
				
				if(userChoice == 1)
					{
						System.out.println("Would you like to:");
						System.out.println("(1) Add a student.");
						System.out.println("(2) Delete a Student.");
						
						Scanner userInput1 = new Scanner(System.in);
						int userChoice1 = userInput1.nextInt();
						
						if(userChoice1 == 1)
							{
								AddStudent.studentAdd();
							}
						if(userChoice1 == 2)
							{
								DeleteStudent.studentDelete();
							}
					}
				
				else if(userChoice == 2)
					{
						System.out.println("Would you like to:");
						System.out.println("(1) Change a Grade.");
						System.out.println("(2) Switch Classes.");
						
						Scanner userInput2 = new Scanner(System.in);
						int userChoice2 = userInput2.nextInt();
						
						if(userChoice2 == 1)
							{
								ChangeGrade.gradeChange();
							}
						if(userChoice2 == 2)
							{
								SwitchClasses.classSwitch();
							}
						
					}
				
				else if(userChoice == 3)
					{
						System.out.println("Would you like to:");
						System.out.println("(1) Sort by GPA.");
						System.out.println("(2) Sort by Last Name.");
						System.out.println("(3) Sort by Period.");
						
						Scanner userInput3 = new Scanner(System.in);
						int userChoice3 = userInput3.nextInt();
						
						if(userChoice3 == 1)
							{
								SortByGPA.gpaSort();
							}
						if(userChoice3 == 2)
							{
								SortByLastName.lastNameSort();
							}
						if(userChoice3 == 3)
							{
								SortByPeriod.periodSort();
							}
					}
				
				System.out.println("Would you like to run again?");
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				Scanner runAgain = new Scanner (System.in);
				int userAgain = runAgain.nextInt();
				if(userAgain != 1)
					{
						run = false;
						System.out.println("Thank you for using the SIS.");
					}
				System.out.println();
					}
				
				
			}

	}
