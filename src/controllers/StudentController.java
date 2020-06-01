package controllers;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.IStudentService;

import java.util.ArrayList;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping()
    public ModelAndView showAllStudent(){
        ModelAndView modelAndView =new ModelAndView("students");
        ArrayList<Student> students = studentService.getAllStudent();
        modelAndView.addObject("students", students);
        return modelAndView;
    }
}
