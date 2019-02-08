
public class Roster
	{
		public static void roster()
		{
			System.out.printf("%3s %12s %12s %12s %12s %12s %5s \n", "ID", "First Name", "Last Name", "Period 1", "Period 2", "Period 3", "GPA");
			for(int i = 0; i < DataBase.students.size(); i++)
				{
					System.out.printf("%3s %12s %12s %12s %12s %12s %5s \n", (i+1) + ")", DataBase.students.get(i).getFirstName(), DataBase.students.get(i).getLastName(), DataBase.students.get(i).getOne(), DataBase.students.get(i).getOneGrade(), DataBase.students.get(i).getTwo(), DataBase.students.get(i).getTwoGrade(), DataBase.students.get(i).getThree(), DataBase.students.get(i).getThreeGrade(), DataBase.students.get(i).getGpa());
				}
		}
	}
