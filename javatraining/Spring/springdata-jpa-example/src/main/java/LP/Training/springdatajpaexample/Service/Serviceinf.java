package LP.Training.springdatajpaexample.Service;

import LP.Training.springdatajpaexample.Modal.Student;

import java.util.List;
import java.util.Optional;

public interface Serviceinf {
    public List<Student> getAllStudents();
    public Student saveStudent(Student student);
    public Optional<Student> selectStudent(Integer sid);
}
