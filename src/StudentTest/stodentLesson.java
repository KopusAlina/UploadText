package StudentTest;

public class stodentLesson {

    public static void equalStudent(Student s1, Student s2) {
        if (s1.name.equals(s2.name) && s1.kurs == s2.kurs && s1.point == s2.point)
            System.out.println("Студенты одинаковы");
        else
            System.out.println("Студенты разные");
    }

    public static void equalsAtributeStudents(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.kurs == s2.kurs) {
                if (s1.point == s2.point) {
                    System.out.println("У студентов всё одинаково");
                } else {
                    System.out.println("У студентов всё одинаково кроме оценок");
                }
            } else {
                System.out.println("У студентов отличаются курсы");
            }
        }
        else {
            System.out.println("Имена у студентов разные");
            }
        }

    public static void main(String[] args) {
        Student s1 = new Student("Vanya", 2, 3.5);
        Student s2 = new Student("Katya", 2, 34.1);
        equalStudent(s1, s2);
        equalsAtributeStudents(s1, s2);
    }
}