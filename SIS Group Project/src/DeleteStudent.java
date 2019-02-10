import java.util.Scanner;

public class DeleteStudent
	{

			public static void studentDelete()
			{
				Scanner userInput = new Scanner(System.in);
				
				System.out.println("What student would you like to remove?");
				Roster.roster();
				int userChoice = userInput.nextInt();
				
				System.out.println();
				System.out.println("Here is your new class list:");
				DataBase.students.remove(userChoice - 1);
				
				Roster.roster();
				
				
				
				
				
			}
	}
