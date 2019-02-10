import java.util.Collections;

public class SortGPA
	{
		public static void sortgpa(){
			System.out.printf("%3s %12s %12s %12s %12s %12s %5s \n", "ID", "First Name", "Last Name", "Period 1", "Period 2", "Period 3", "GPA");
			
			double formattedGPA = 0;
			for(int i = 0; i < DataBase.students.size(); i++)
			{
				formattedGPA = 0;
				formattedGPA = DataBase.students.get(i).getGpa() * 10;
				formattedGPA = Math.round(formattedGPA);
				formattedGPA = formattedGPA / 10;
				DataBase.students.get(i).setGpa(formattedGPA);
			}
			
			Collections.sort(DataBase.students, new SortByGPA());
			for(int i = 0; i < DataBase.students.size(); i++){
				System.out.printf("%3s %12s %12s %12s %12s %12s %5s \n", (i+1) + ")", DataBase.students.get(i).getFirstName(), DataBase.students.get(i).getLastName(), DataBase.students.get(i).getOne() +" "+ DataBase.students.get(i).getOneGrade(), DataBase.students.get(i).getTwo()+" "+ DataBase.students.get(i).getTwoGrade(), DataBase.students.get(i).getThree() +" "+ DataBase.students.get(i).getThreeGrade(), DataBase.students.get(i).getGpa());
			}
		}
	}
//