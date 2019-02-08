
import java.io.*;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util. *;

public class DataBase 
	{
		public	static ArrayList<Student>students = new ArrayList<Student>();
		public static String grade;
		public static double totalPoints = 0;
		public static double totalpoints2 = 0;
		public static void fillArray() throws IOException
			{
				Scanner names = new Scanner(new File("StudentList.txt"));
				while(names.hasNext()){
					String A = names.nextLine();
					String array1[] = A.split(" ");
					
						students.add(new Student(array1[0],array1[1],array1[2],array1[3],array1[4],array1[5],array1[6],array1[7],0));
					
				}
				
				
				
				for(int i = 0; i < students.size(); i++){
					totalPoints = 0;
					totalpoints2 = 0;
					grade = students.get(i).getOneGrade();
					convertGPA();
					totalpoints2 += totalPoints;
					grade = students.get(i).getTwoGrade();
					convertGPA();
					totalpoints2 += totalPoints;
					grade = students.get(i).getThreeGrade();
					convertGPA();
					totalpoints2 += totalPoints;
					students.get(i).setGpa(totalpoints2/3);
					
				}
				
				
				
				for(int i = 0; i < students.size(); i++){
					System.out.println(students.get(i).getFirstName()+students.get(i).getLastName()+students.get(i).getOne()+students.get(i).getOneGrade()+students.get(i).getTwo()+students.get(i).getTwoGrade()+students.get(i).getThree()+students.get(i).getThreeGrade()+students.get(i).getGpa());
				}
				
			}

	public static double convertGPA()
			{
				
				
				switch(grade){
					case "A+":
							{
						totalPoints = 4.30;
						break;
					}
					
					case "A":{
						totalPoints = 4.00;
						break;
					}
					
					case "A-":{
						totalPoints = 3.70;
						break;
					}
					
					case "B+":{
						totalPoints = 3.30;
						break;
					}
					
					case "B":{
						totalPoints = 3.00;
						break;
					}
					
					case "B-":{
						totalPoints = 2.70;
						break;
					}
					
					case "C+":{
						totalPoints = 2.30;
						break;
					}
					
					case "C":{
						totalPoints = 2.00;
						break;
					}
					
					case "C-":{
						totalPoints = 1.70;
						break;
					}
					
					case "D+":{
						totalPoints = 1.30;
						break;
					}
					
					case "D":{
						totalPoints = 1.00;
						break;
					}
					
					case "D-":{
						totalPoints = 0.90;
						break;
					}
					
					case "F":{
						totalPoints = 0.00;
						break;
					}
				}
				return totalPoints;
				
				
				
			}
			
		
	}

