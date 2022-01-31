public class Courses {

  private String courseName;
  private int courseCost;

  public Courses(String courseName, int courseCost) {
    this.courseName = courseName;
    this.courseCost = courseCost;
  }


  public int getCourseCost() {
    return courseCost;
  }

  @Override
  public String toString() {
    return "Course name:" + courseName;
  }
}
