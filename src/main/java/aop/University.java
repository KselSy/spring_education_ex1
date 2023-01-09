package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();
    public void addStudent(){
        Student st1 = new Student("Anton Kiselev", 4, 4.45);
        Student st2 = new Student("Alina Barsukova", 3, 4.81);
        Student st3 = new Student("Sergey Konstantinov", 1, 3.67);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}
