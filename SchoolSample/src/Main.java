import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many students you want to add ?");
    int numberOfStudent = sc.nextInt();
    Student[] students = new Student[numberOfStudent];
    System.out.println("Enter the name of student, grade level and student balance:");
    for (int i = 0; i < numberOfStudent; i++) {
      students[i] = new Student(sc.next(), sc.nextInt(), sc.nextDouble());
      System.out.println((i) + "." + students[i].getUniqueStudentID());
    }

    HashMap<String, Courses> allPossibleCourses = new HashMap<String, Courses>();
    allPossibleCourses.put("History1", new Courses("History", 600));
    allPossibleCourses.put("Chemistry1", new Courses("Chemistry", 600));
    allPossibleCourses.put("Biology1", new Courses("Biology", 600));
    allPossibleCourses.put("Mathematics1", new Courses("Mathematics", 600));
    allPossibleCourses.put("ComputerScience1", new Courses("ComputerScience", 600));
    allPossibleCourses.put("English1", new Courses("English", 600));

    System.out.println(
        "You can enroll on these courses:\n" + "History1\n" + "Chemistry1\n" + "Biology1\n"
            + "Mathematics1\n" + "ComputerScience1\n" + "English1\n");

    System.out.println(
        "Choose the student and the course for her/him to enroll(for every course you have to mention studentIndex first before you entered the course name):");

    doing:
    while (true) {
      int studentIndex = sc.nextInt();
      String course = sc.next();
      switch (course) {
        case "History1":
          try {
            students[studentIndex].enrollOnCourse(allPossibleCourses.get("History1"));
          } catch (ExceptionCourse exceptionSameCourse) {
            System.out.println(exceptionSameCourse.getTxt());
          }
          break;
        case "Chemistry1":
          try {
            students[studentIndex].enrollOnCourse(allPossibleCourses.get("Chemistry1"));
          } catch (ExceptionCourse exceptionSameCourse) {
            System.out.println(exceptionSameCourse.getTxt());
          }
          break;
        case "Biology1":
          try {
            students[studentIndex].enrollOnCourse(allPossibleCourses.get("Biology1"));
          } catch (ExceptionCourse exceptionSameCourse) {
            System.out.println(exceptionSameCourse.getTxt());
          }
          break;
        case "Mathematic1":
          try {
            students[studentIndex].enrollOnCourse(allPossibleCourses.get("Mathematics1"));
          } catch (ExceptionCourse exceptionSameCourse) {
            System.out.println(exceptionSameCourse.getTxt());
          }
          break;
        case "ComputerScience1":
          try {
            students[studentIndex].enrollOnCourse(allPossibleCourses.get("ComputerScience1"));
          } catch (ExceptionCourse exceptionSameCourse) {
            System.out.println(exceptionSameCourse.getTxt());
          }
          break;
        case "English1":
          try {
            students[studentIndex].enrollOnCourse(allPossibleCourses.get("English1"));
          } catch (ExceptionCourse exceptionSameCourse) {
            System.out.println(exceptionSameCourse.getTxt());
          }
          break;
        case "Break":
          String s = "";
          for (int i = 0; i < students.length; i++) {
            s += students[i].toString() + "\n";
          }
          System.out.println("Current info about students:" + s);
        default:
          System.out.println("The course you want to enroll doesnot exist");
          break doing;
      }
    }
  }
}
