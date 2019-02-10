import java.util.Collections;
import java.util.Scanner;

public class SortP
	{
		public static void periodSort()
			{
			
			
			double formattedGPA = 0;
			for(int i = 0; i < DataBase.students.size(); i++)
			{
				formattedGPA = 0;
				formattedGPA = DataBase.students.get(i).getGpa() * 10;
				formattedGPA = Math.round(formattedGPA);
				formattedGPA = formattedGPA / 10;
				DataBase.students.get(i).setGpa(formattedGPA);
			}
			
				System.out.println("Which period would you like to sort by?");
				System.out.println("(1) Period 1");
				System.out.println("(2) Period 2");
				System.out.println("(3) Period 3");
				Scanner userinput1 = new Scanner(System.in);
				int choice = userinput1.nextInt();
				
				if(choice == 1){
					Collections.sort(DataBase.students, new SortByPeriod1());
				}
				else if(choice == 2){
					Collections.sort(DataBase.students, new SortByPeriod2());
					
				}
				else if(choice == 3){
					Collections.sort(DataBase.students, new SortByPeriod3());
				}
				
				System.out.printf("%3s %12s %12s %12s %12s %12s %5s \n", "ID", "First Name", "Last Name", "Period 1", "Period 2", "Period 3", "GPA");
				for(int i = 0; i < DataBase.students.size(); i++){
					System.out.printf("%3s %12s %12s %12s %12s %12s %5s \n", (i+1) + ")", DataBase.students.get(i).getFirstName(), DataBase.students.get(i).getLastName(), DataBase.students.get(i).getOne() +" "+ DataBase.students.get(i).getOneGrade(), DataBase.students.get(i).getTwo()+" "+ DataBase.students.get(i).getTwoGrade(), DataBase.students.get(i).getThree() +" "+ DataBase.students.get(i).getThreeGrade(), DataBase.students.get(i).getGpa());
				}
			}
	}
