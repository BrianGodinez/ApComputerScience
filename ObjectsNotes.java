public class Student {
  // attributes
  private String name;
  private double grade;
  private boolean behavior;

  // no argument contructor
  public Student() {

  }

  // parameterized contructor
  public Student(String n, double g, boolean b) {
    name = n;
    grade = g;
    behavior = b;
  }

  // overload contructor
  public Student(String n, double g) {
    name = n;
    grade = g;
  }

  // methods
  public void changeGrade(double g) {
    grade = g;
  }

  // getter methods or acessor methods
  public String getName() {
    return name;
  }

  public double getGrade() {
    return grade;
  }

  public boolean getBehavior() {
    return behavior;
  }

public void printOutStudent()
{
  System.out.println("Name:\t" + getName() + "Gpa:\t" + getGrade() "Problem:\t" + getBehavior());
}

  public static void main(String[] args) {
    Student student1 = new Student("Brian", 6.9, false);
    student1.printOutStudent();

    Student student2 = new Student("Briann", 9.6);
    student1.printOutStudent(String n, double g);

  }
}
