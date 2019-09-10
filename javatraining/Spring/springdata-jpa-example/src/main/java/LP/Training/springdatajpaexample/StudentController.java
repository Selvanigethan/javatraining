package LP.Training.springdatajpaexample;

import LP.Training.springdatajpaexample.Modal.Student;
import LP.Training.springdatajpaexample.Service.Serviceinf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/sms")
public class StudentController {

    @Autowired
    Serviceinf serviceinf;

   @RequestMapping(value = "/hello")
    public String greeting()
   {
       return "hello Springboot";
   }

   @RequestMapping(value = "/student",method=RequestMethod.POST)
   public Student saveStudent (@RequestBody Student student) {
       return serviceinf.saveStudent(student);
   }


   @RequestMapping(value="/student",method = RequestMethod.GET)
   public List<Student> getAllStudents(){
       return serviceinf.getAllStudents();
   }

    @RequestMapping(value="/student/{id}",method = RequestMethod.GET)
    public Optional<Student> selectStudent (@PathVariable Integer id){
       return serviceinf.selectStudent(id);
    }
}
