import java.util.*;
public class SortByPeriod1 implements Comparator<Student>
	{
		public int compare(Student s1, Student s2){
			return s1.getOne().compareTo(s2.getOne());
		}
		

		
	}
