
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Vaccine {
  //Write Your Code Here..
  private int age;
  private float dosage;

  public Vaccine(int age){
	  this.age=age;
	  setDosage();
	  

  }

  public int getAge(){
	  return age;
  }

  public void setAge(int age){
	  this.age=age;
	  setDosage();
	  
	  
  }

  public float getDosage(){
	  
	  return dosage;
  }

  public void setDosage(){
	  if(age >= 45){
		  dosage = 250.0f;

	  }
	  else if(age>=20){
		  dosage = 200.0f;
		  
	  }
	  else {
		  dosage=100.0f;
	  }
  }

}



class VaccinationCamp {
  //Write Your Code Here..
  ArrayList<Vaccine> list = new ArrayList<>();
  
  public VaccinationCamp() {
	  
  }
  

  public void assignVaccine(){
	  
	  
  }

  public float vaccineInjected(){
	 float total = 0.0f;
	 
	 for(Vaccine vaccine : list) {
		 total = total + vaccine.getDosage();
	 }
	  
	 
	 return total;
  }
  
  }

public class Covid {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		
		VaccinationCamp vc = new VaccinationCamp();
		
		vc.list.add(new Vaccine(49));
		vc.list.add(new Vaccine(26));
		vc.list.add(new Vaccine(19));
		
		vc.assignVaccine();
		float op = vc.vaccineInjected();
		System.out.println(op);
		
	}
}