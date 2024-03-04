

import java.util.*;



class   A {
	int j=6;
	int i=9;
	
	public boolean equals(Object o) {
		A a = (A)o;
		
		if(this.i == a.i) {
			return true;
		}else {
			return false;
		}
		
		
		
		public int hashCode() {
			return 7;
		}
	}
}
public class CollectionsList {
	public static void main(String args[]) {
		
		
	}

}












//import java.util.HashSet;
//import java.util.Set;
//
//
//class   A {
//	int j=6;
//	int i=9;
//}
//public class CollectionsList {
//	public static void main(String args[]) {
//		
//		A a1 = new A();
//		A a2 = new A();
//		A a3 = new A();
//		
//		System.out.println(a1.hashCode());
//		System.out.println(a2.hashCode());
//		System.out.println(a3.hashCode());
//	
//		
//	}
//
//}





//import java.util.HashSet;
//import java.util.Set;
//
//public class CollectionsList {
//	public static void main(String args[]) {
//		Set<String> set = new HashSet<String>();
//		
//		set.add("Saa");
//		set.add("Poo");
//		set.add("Dii");
//		set.add("Anuu");
//		
//		System.out.println(set);
//		
//		for(String s : set) {
//			System.out.println(s);
//		}
//		
//	}
//
//}
















//import java.util.LinkedList;
//import java.util.List;
//
//
//public class CollectionsList {
//	public static void main(String args[]) {
//		LinkedList<String> linkedlist = new LinkedList<String>();
//		
//		linkedlist.add("Sakshi");
//		linkedlist.add("Lokhande");
//		
//		for(String str : linkedlist) {
//			System.out.print(str + " ");
//		}
//		
//		System.out.print(linkedlist.getFirst() + " ");
//		System.out.println(linkedlist.getLast());
//		
//		
//		
//	}
//
//}










//public class CollectionsList {
//	public static void main(String args[]) {
//		List<Integer> list = new ArrayList<Integer>();      //auto unboxing
//		List<Integer> list2 = new ArrayList<Integer>();
//		
//		list.add(3);
//		list.add(1);
//		list.add(10);
//		list.add(19);
//		
//		list2.addAll(list);
//		System.out.println(list2);
//		
//		System.out.println(list2.equals(list));
//		System.out.println(list2==list);
//		
//		list2.set(1, 2);
//		System.out.println(list2.equals(list));
//		System.out.println(list2);
//		
//		System.out.println(list2.indexOf(10));
//		System.out.println(list2.indexOf(11));
//		
//		System.out.println(list.contains(10));
//		
//		
//		
//		
//	}
//
//}











//public class CollectionsList {
//	public static void main(String args[]) {
//		List<Integer> list = new ArrayList<Integer>();      //auto unboxing
//		
//		list.add(3);
//		list.add(1);
//		list.add(10);
//		list.add(19);
//		
//		Integer removalelement = 19;
//		System.out.println(list.remove(0));
//		System.out.println(list.remove(removalelement));
//		System.out.println(list);
//		
//		
//		
//		
//	}
//
//}














//import java.util.ArrayList;
//
//
//public class CollectionsList {
//	public static void main(String args[]) {
//		
//		ArrayList list = new ArrayList();
//		ArrayList list1 = new ArrayList();
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		
//		
////		Integer i1 = 4;
////		Integer i2 = 5;
////		list.add(i1);
////		list.add(i2);
//		list.add(3);
//		list.add(1);
//		list.add(10);
//		System.out.println(list.isEmpty());
//		System.out.println(list.size());
//		
//		list1.addAll(list);
//		System.out.println(list1);         
//		
//		list.add(3,30);
//		System.out.println(list);
//		System.out.println(list.get(2));
//		
////		for(int i=0;i<list.size();i++) {
////			System.out.println(list.get(i));
////			
////		}
//		list.add("Sakshi");
//		
//		for(Object o : list) {
//			System.out.println(o);
//		}
//		
//		
//	}
//
//}
