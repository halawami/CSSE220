import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;


public class Student {
	private String name;
	private ArrayList<Double> grades;
	private int absence;
	private int average;
	//DONE: You'll probably need to have some more fields here
	/**
	 * makes a new student object
	 * 
	 * @param newName the name of the student
	 */
	
	public Student(String newName) {
		//DONE: initialize fields here
		this.name = newName;
		this.grades = new ArrayList<Double>();
		this.absence = 0;
		this.average = 0;
	}

	/**
	 * gets the name of the student
	 * 
	 * @return the name of the student
	 */
	public String getName() {
		// DONE your code here
		return this.name;
	}
	
	
	public void addAbsence(){
		this.absence++;
	}
	
	public int getAbsence(){
		return this.absence;
	}
	
	public void addGrade(double grade){
		this.grades.add(grade);
	}
	
	public double getAverageGrade(){
		double average = 0.0;
		if(this.grades.size()==0){
			return 0;
		}
		for (double i: grades){
			average += i;
		}
		average = average/this.grades.size();
		return average;
	}
	
	//DONE: You'll need to add some new methods here
}
