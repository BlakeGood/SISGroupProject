import java.io.*;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util. *;

public class DataBase 
	{
		public	static ArrayList<Student>students = new ArrayList<Student>();
		
		public static void fillArray() throws IOException
			{
				Scanner names = new Scanner(new File("StudentList.txt"));
				while(names.hasNext()){
					String A = names.nextLine();
					String array1[] = A.split(" ");
					
						students.add(new Student(array1[0],array1[1],array1[2],array1[3],array1[4],array1[5],array1[6],array1[7],0));
					
				}
				
				System.out.println(students.size());
				double totalPoints = 0;
				
				////
				for(int i = 0; i < students.size(); i++){
					
						if(students.get(i).getOneGrade().equals("A+")){
							totalPoints = 4.3;
						}
						else if(students.get(i).getOneGrade().equals("A")){
							totalPoints = 4.0;
						}
						else if(students.get(i).getOneGrade().equals("A-")){
							totalPoints = 3.7;
						}
						else if(students.get(i).getOneGrade().equals("B+")){
							totalPoints = 3.3;
						}
						else if(students.get(i).getOneGrade().equals("B")){
							totalPoints = 3.0;
						}
						else if(students.get(i).getOneGrade().equals("B-")){
							totalPoints = 2.7;
						}
						else if(students.get(i).getOneGrade().equals("C+")){
							totalPoints = 2.3;
						}
						else if(students.get(i).getOneGrade().equals("C")){
							totalPoints = 2;
						}
						else if(students.get(i).getOneGrade().equals("C-")){
							totalPoints = 1.7;
						}
						else if(students.get(i).getOneGrade().equals("D+")){
							totalPoints = 1.3;
						}
						else if(students.get(i).getOneGrade().equals("D")){
							totalPoints = 1.0;
						}
						else if(students.get(i).getOneGrade().equals("D-")){
							totalPoints = 0.7;
						}
						else if(students.get(i).getOneGrade().equals("F")){
							totalPoints = 0.3;
						}
						
						

		
						
//						for(int n = 0; n < students.size(); n++){
//							double Gfinal = (totalPoints + G2 + G3)/3;
//							students.get(n).setGpa(Gfinal);
//							
//						}
//						
//						totalPoints = 0;
//						G2 = 0;
//						G3 = 0;
//					
				}
				
				
//				
//				for(int i = 0; i < students.size(); i++){
//					System.out.println(students.get(i).getFirstName()+students.get(i).getLastName()+students.get(i).getOne()+students.get(i).getOneGrade()+students.get(i).getTwo()+students.get(i).getTwoGrade()+students.get(i).getThree()+students.get(i).getThreeGrade()+students.get(i).getGpa());
//				}
				
			}
			
		
	}
