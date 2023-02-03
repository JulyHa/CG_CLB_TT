package Buoi3_01022023;

import java.util.*;

public class DemoComperator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Linh", 22));
        students.add(new Student("Khải", 29));
        students.add(new Student("Khải", 26));
        students.add(new Student("Nam", 18));

//        Collections.sort(students);
//
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//        System.out.println(students);
//
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//
//        System.out.println(students);

       students.sort(Comparator.comparing(Student::getAge));
        System.out.println(students);


    }
}
