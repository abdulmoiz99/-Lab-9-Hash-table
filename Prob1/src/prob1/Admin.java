package prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> result = new HashMap<>();

		for (Student student : students) {
			result.put(new Key(student.getFirstName(), student.getLastName()), student);
		}

		return result;
	}
}
