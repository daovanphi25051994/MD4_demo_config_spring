package service;

import model.Student;

import java.util.ArrayList;

public class StudentService implements IStudentService {

    private static ArrayList<Student> studentList = new ArrayList<>();

    static {
        studentList = new ArrayList<>();
        studentList.add( new Student("1", "Binh", " Binh Dinh"));
        studentList.add(new Student("2", "Huynh", "Hai Duong"));
        studentList.add(new Student("3", "Linh", "Ha Noi"));
        studentList.add(new Student("4", "Dat", "Hung Yen"));
        studentList.add(new Student("5", "Thinh", "Hai Phong"));
    }

    @Override
    public ArrayList<Student> getAllStudent() {
        return studentList;
    }
}
