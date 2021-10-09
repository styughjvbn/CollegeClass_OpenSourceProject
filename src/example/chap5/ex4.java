package example.chap5;

class Person_ { }
class Student_ extends Person_ { }
class Researcher extends Person_ { }
class Professor extends Researcher { }

public class ex4 {

	static void print(Person_ p) {
		if(p instanceof Person_)
		System.out.print("Person ");
		if(p instanceof Student_)
		System.out.print("Student ");
		if(p instanceof Researcher)
		System.out.print("Researcher ");
		if(p instanceof Professor)
		System.out.print("Professor ");
		System.out.println();
		}
		public static void main(String[] args) {
		System.out.print("new Student() ->\t"); print(new Student_());
		System.out.print("new Researcher() ->\t"); print(new Researcher());
		System.out.print("new Professor() ->\t"); print(new Professor());
		}

}
