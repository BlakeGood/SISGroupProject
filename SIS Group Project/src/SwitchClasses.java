import java.util.Scanner;

public class SwitchClasses
	{

			public static void classSwitch()
			{
				Scanner userInput = new Scanner(System.in);
				
				System.out.println("Which student's classes would you like to switch?");
				Roster.roster();
				int userChoice = userInput.nextInt();
				
				String firstClass = DataBase.students.get(userChoice - 1).getOne();
				String secondClass = DataBase.students.get(userChoice - 1).getTwo();
				String thirdClass = DataBase.students.get(userChoice - 1).getThree();
				
				System.out.println("Which class would you like to switch " + DataBase.students.get(userChoice - 1).getFirstName() + " " + DataBase.students.get(userChoice - 1).getLastName() + " from?");
				System.out.println("(1) " + DataBase.students.get(userChoice - 1).getOne());
				System.out.println("(2) " + DataBase.students.get(userChoice - 1).getTwo());
				System.out.println("(3) " + DataBase.students.get(userChoice - 1).getThree());
				Scanner userInput2 = new Scanner(System.in);
				int userClassFrom = userInput2.nextInt();
				
				System.out.println("Which class would you like to switch " + DataBase.students.get(userChoice - 1).getFirstName() + " " + DataBase.students.get(userChoice - 1).getLastName() + " into?");
				System.out.println("(1) " + DataBase.students.get(userChoice - 1).getOne());
				System.out.println("(2) " + DataBase.students.get(userChoice - 1).getTwo());
				System.out.println("(3) " + DataBase.students.get(userChoice - 1).getThree());
				Scanner userInput3 = new Scanner(System.in);
				int userClassInto = userInput3.nextInt();
				
				if(userClassFrom == 1 && userClassInto == 2)
					{
						DataBase.students.get(userChoice - 1).setOne(secondClass);
						DataBase.students.get(userChoice - 1).setTwo(firstClass);
					}
				else if(userClassFrom == 1 && userClassInto == 3)
					{
						DataBase.students.get(userChoice - 1).setOne(thirdClass);
						DataBase.students.get(userChoice - 1).setThree(firstClass);
					}
				else if(userClassFrom == 2 && userClassInto == 1)
					{
						DataBase.students.get(userChoice - 1).setTwo(firstClass);
						DataBase.students.get(userChoice - 1).setOne(secondClass);
					}
				else if(userClassFrom == 2 && userClassInto == 3)
					{
						DataBase.students.get(userChoice - 1).setTwo(thirdClass);
						DataBase.students.get(userChoice - 1).setThree(secondClass);
					}
				else if(userClassFrom == 3 && userClassInto == 1)
					{
						DataBase.students.get(userChoice - 1).setThree(firstClass);
						DataBase.students.get(userChoice - 1).setOne(thirdClass);
					}
				else if(userClassFrom == 1 && userClassInto == 2)
					{
						DataBase.students.get(userChoice - 1).setThree(firstClass);
						DataBase.students.get(userChoice - 1).setTwo(thirdClass);
					}
				else if(userClassFrom == userClassInto)
					{
						System.out.println("The students schedule will stay the same.");
						System.out.println();
					}
				
				System.out.println(DataBase.students.get(userChoice - 1).getFirstName() + " " + DataBase.students.get(userChoice - 1).getLastName() + "'s new schedule is:");
				System.out.println(DataBase.students.get(userChoice - 1).getOne());
				System.out.println(DataBase.students.get(userChoice - 1).getTwo());
				System.out.println(DataBase.students.get(userChoice - 1).getThree());
				System.out.println();
				
				
			}
	}
