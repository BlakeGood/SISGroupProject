import java.util.Comparator;

public class SortByPeriod2  implements Comparator<Student>
	{
		public int compare(Student s1, Student s2){
			return s1.getTwo().compareTo(s2.getTwo());
		}
	}
