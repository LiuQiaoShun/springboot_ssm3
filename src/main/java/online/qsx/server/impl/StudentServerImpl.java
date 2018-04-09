package online.qsx.server.impl;

import online.qsx.mapper.StudentMapper;
import online.qsx.model.Student;
import online.qsx.server.StudentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServerImpl implements StudentServer {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAllStudent(Student student) {
        return studentMapper.findAllStudent(student);
    }

    @Override
    public int save(Student student) {
        return studentMapper.save(student);
    }

    @Override
    public List<Student> findStudentByJave(Student student) {
        return studentMapper.findStudentByJave(student);
    }

    @Override
    public List<Student> findStudent(Student student) {
        return studentMapper.findStudent(student);
    }
}
