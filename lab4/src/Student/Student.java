package Student;

public class Student {
    private final int age;
    private final String name;
    private final int course;
    private final String courseName;
    private final String[] lessons;

    public Student(int age, String name, int course, String courseName, String[] lessons){
        this.age = age;
        this.name = name;
        this.course = course;
        this.courseName = courseName;
        this.lessons = lessons;
    }

    public int getAge(){
        return age;
    }

    public int getCourse(){
        return course;
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder("Student - " + name + "\n"
                + "Age - " + age + "\n"
                + "Course number - " + course + "\n"
                + "Course name - " + courseName + "\n"
                + "Lessons - ");
        for(int i = 0; i < lessons.length; ++i){
            string.append(lessons[i]);
            if(i + 1 != lessons.length){
                string.append(", ");
            }
        }
        return string.append("\n").toString();
    }

    public static void printStudents(Student[] students){
        for(Student student: students){
            System.out.println(student);
        }
    }
}
