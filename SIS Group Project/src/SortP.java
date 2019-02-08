import java.util.Collections;
import java.util.Scanner;

public class SortP
	{
		public static void periodSort()
			{
				System.out.println("Do you want sort by which period? (1,2,3)");
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
				
				for(int i = 0; i < DataBase.students.size(); i++){
					System.out.println("First Name: " + DataBase.students.get(i).getFirstName() + " Last Name: " + DataBase.students.get(i).getLastName() + " First Period: " + DataBase.students.get(i).getOne() + DataBase.students.get(i).getOneGrade() + " Second Period: " + DataBase.students.get(i).getTwo() + DataBase.students.get(i).getTwoGrade() + " Third Period: " + DataBase.students.get(i).getThree() + DataBase.students.get(i).getThreeGrade() + " GPA: " + DataBase.students.get(i).getGpa());
				}
			}
	}
