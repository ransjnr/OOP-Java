public class Lesson {
    String courseName;
    String courseCode;
    boolean lessonStatus;

    void startLesson() {
        System.out.println("The" + " " + courseName + " " + "with" + " " + courseCode + " " + "is supposed to come on today");
        if (lessonStatus == true)
            System.out.println("Class is already in session");
        else {
            lessonStatus = true;
            System.out.println("Class is now starting");
        }
    }
    public static void main(String[] args){
        Lesson L = new Lesson();
        L.courseCode = "COE 356";
        L.courseName = "Anatomy";
        System.out.println("____________");
        L.startLesson();
    }
}