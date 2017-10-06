import java.util.ArrayList;
import java.util.HashMap;

public class Team {
	private String name;
	private ArrayList<Student> teamMembers;
	private ArrayList<Double> grades;
	// You'll need to add methods, constructors and fields here

	public Team(String newName) {
		this.name = newName;
		this.teamMembers = new ArrayList<Student>();
		this.grades = new ArrayList<Double>();

	}
	
	public void addGrade(double grade){
		this.grades.add(grade);
	}
	
	public String getName() {
		return this.name;
	}

	public void addStudentToTeam(String teamName, Student student) {
		this.teamMembers.add(student);
	}

	public ArrayList<Student> getMembers() {
		return this.teamMembers;
		}

	public double getAverageGrade() {
		double average = 0.0;
		System.out.println(grades);
		if (this.grades.size() == 0) {
			return 0;
		}
		for (double i : grades) {
			average += i;
		}
		System.out.println(average);
		average = average / this.grades.size();
		return average;
	}

}
