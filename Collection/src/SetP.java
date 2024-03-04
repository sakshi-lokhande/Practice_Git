import java.util.Set;
import java.util.TreeSet;


class Iphone implements Comparable<Iphone>{
	int price;
	int manufacturing;
	String color;
	
	public int compareTo(Iphone o) {
		int value=0;
		
		if(this.price < o.price) {
			value = 1;
		}else if(this.price>o.price) {
			value =-1;
		}
		return value;
	}
	
	public String toString() {
		return "Price is" +" "  + price;
	}
}
public class SetP {
	public static void main(String[] args) {
		Set<Iphone> set = new TreeSet<Iphone>();
		
		Iphone a1 = new Iphone();
		Iphone a2 = new Iphone();
		Iphone a3 = new Iphone();
		
		a1.price =56;
		a2.price = 78;
		a3.price = 98;
		
		set.add(a1);
		set.add(a2);
		set.add(a3);
		
		for(Iphone a : set) {
			System.out.println(a);
		}
	
		
		
	}

}
