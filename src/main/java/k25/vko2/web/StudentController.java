package k25.vko2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import k25.vko2.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class StudentController {

    public static List<Student> opiskelijat = new ArrayList<Student>();
   
    static {
    opiskelijat.add(new Student("Pekka", "Virtanen"));
    opiskelijat.add(new Student("Aino", "Alanko"));
    opiskelijat.add(new Student("Kauko", "Kaunis"));
    }

    @GetMapping("/hello")
    public String showStudents(Model model) {
        model.addAttribute("students", opiskelijat); //html käytetään students
        return "studentlist";
    }

    @GetMapping("/hello1")
    public String showSomething (@RequestParam String name, @RequestParam int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "tervehdys";
    }
    
}