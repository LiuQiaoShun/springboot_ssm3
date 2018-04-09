package online.qsx.server;

import online.qsx.model.Student;

import java.util.List;

/**
 * Created by 8888 on 2018/3/8.
 */
public interface StudentServer {
    List<Student> findAllStudent(Student student);

    int save(Student student);

    List<Student> findStudentByJave(Student student);

    List<Student> findStudent(Student student);
}
