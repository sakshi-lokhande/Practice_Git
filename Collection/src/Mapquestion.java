import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Employee{
	
	int id;
	int salary;
	String name;
	
	
	
	public Employee(  String name, int salary) {
		
		 
		this.salary = salary;
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return  name + "," + salary;
	}



//	public Employee(int salary, String name) {
//		
//		this.salary = salary;
//		this.name = name;
//	}




	
}

public class Mapquestion {
	public static void main(String args[]) {
		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();
		Employee em1 = new Employee("Sakshi",90000);
		Employee em2 = new Employee("Divya",80000);
		Employee em3 = new Employee("Poonam",90000);
		Employee em4 = new Employee("Nithya",70000);
		

		
		empMap.put(1, em1);
		empMap.put(2, em2);
		empMap.put(3, em3);
		empMap.put(4, em4);
		
		System.out.println(empMap);
		
		Set<Integer> keyset = empMap.keySet(); 
		
		int i=0;
		int[] sal = new int[4];
		for(int key : keyset) {
			int j=(empMap.get(key).salary);
			if(j>50000) {
				sal[i]=j;
				i++;
			}
			
		}
		
		for(int salary : sal) {
			System.out.println(salary);
		}
		
		
	}

}
