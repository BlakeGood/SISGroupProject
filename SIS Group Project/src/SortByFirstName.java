import java.util.*;
public class SortByFirstName implements Comparator<Student>
	{
		public int compare(Student s1, Student s2){
			return s1.getFirstName().compareTo(s2.getFirstName());
			
		}
	}
