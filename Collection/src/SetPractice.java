import java.util.HashMap;
import java.util.Map;

public class SetPractice {
	public static void main(String args[]) {
		Map<Integer, String> employee = new HashMap<Integer, String>();

		employee.put(105, "Sakshi");
		employee.put(104, "Gouri");
		employee.put(133, "Priya");
		employee.put(102, "Yashu");
		employee.put(166, "Samira");
		employee.put(null, "Samira");
		employee.put(null, null);
		employee.put(null, "SA");
		System.out.println(employee);

		// System.out.println(employee.get(102));
		// System.out.println(employee.remove(102));

//		Set<Integer> keyset = employee.keySet();
//		for(int key : keyset) {
//			System.out.println("The key is " + key + " And the value is "+ employee.get(key));
//		}

	}

}
