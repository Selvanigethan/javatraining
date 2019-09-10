package LP.Training.springdatajpaexample.Service;

import LP.Training.springdatajpaexample.Modal.Student;
import LP.Training.springdatajpaexample.Modal.Telephone;
import LP.Training.springdatajpaexample.Repository.Repositoryinf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Serviceimp implements Serviceinf{

    @Autowired
    Repositoryinf repositoryinf;
    @Override
    public List<Student> getAllStudents() {
        return repositoryinf.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        for (Telephone telephone:student.getTelephones()){
            telephone.setStudent(student);
        }
        return repositoryinf.save(student);
    }

    @Override
    public Optional<Student> selectStudent(Integer sid) {
        return repositoryinf.findById(sid);
    }
}
