import java.util.*;
public class SortFN
	{
		public static void Sortfn()
			{
				Collections.sort(DataBase.students, new SortByFirstName());
				for(int i = 0; i < DataBase.students.size(); i++){
					System.out.println("First Name: " + DataBase.students.get(i).getFirstName() + " Last Name: " + DataBase.students.get(i).getLastName() + " First Period: " + DataBase.students.get(i).getOne() + DataBase.students.get(i).getOneGrade() + " Second Period: " + DataBase.students.get(i).getTwo() + DataBase.students.get(i).getTwoGrade() + " Third Period: " + DataBase.students.get(i).getThree() + DataBase.students.get(i).getThreeGrade() + " GPA: " + DataBase.students.get(i).getGpa());
				}
			}
	}
