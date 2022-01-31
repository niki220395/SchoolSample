public class Student {

  private String studentName;
  private int studentGradeLevel;
  private static int idGenerator = 0;
  private String uniqueStudentID;
  private double studentBalance;
  private Courses[] coursesList;

  public Student(String studentName, int studentGradeLevel, double studentBalance) {
    int randomNumber = (int) (Math.random() * (999 - 100 + 1) + 1000);
    this.studentName = studentName;
    this.studentGradeLevel = studentGradeLevel;
    this.studentBalance = studentBalance;
    uniqueStudentID = "ID:" + this.studentGradeLevel + randomNumber + idGenerator++;
    coursesList = new Courses[6];
  }

  public void enrollOnCourse(Courses course) throws ExceptionCourse {
    for (int i = 0; i < coursesList.length; i++) {
      if (coursesList[i].equals(course)) {
        throw new ExceptionCourse();
      }
    }

    if ((studentBalance - course.getCourseCost()) > 0) {
      coursesList[coursesList.length] = course;
      studentBalance = studentBalance - course.getCourseCost();
    } else {
      throw new ExceptionCourse();
    }
  }

  public double getStudentBalance() {
    return studentBalance;
  }

  public String getUniqueStudentID() {
    return uniqueStudentID;
  }

  @Override
  public String toString() {
    String s = "";
    for (int i = 0; i < coursesList.length; i++) {
      s += coursesList[i] + "\n";
    }
    return studentName + "/" + uniqueStudentID + "/" + "Balance:" + studentBalance
        + "\nEnrolled courses:\n" + s;
  }
}