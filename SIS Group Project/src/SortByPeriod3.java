import java.util.Comparator;

public class SortByPeriod3  implements Comparator<Student>
	{
		public int compare(Student s1, Student s2){
			return s1.getThree().compareTo(s2.getThree());
		}
	}
