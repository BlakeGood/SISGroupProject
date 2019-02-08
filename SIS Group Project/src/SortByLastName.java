import java.io.IOException;
import java.util.*;
public class SortByLastName implements Comparator<Student>
	{
		
		public int compare(Student s1, Student s2){
			return s1.getLastName().compareTo(s2.getLastName());
			
		}
		
		

	}
