package com.shesh.db.service;

import com.shesh.db.dao.StudentDao;
import com.shesh.db.dao.StudentDaoImpl;
import com.shesh.db.model.Student;

import java.io.IOException;
import java.util.List;


/**
 * Created by shesh on 5/23/17.
 */
public class StudentServiceImpl implements  StudentService{

    private StudentDao studentDao;

    public StudentServiceImpl() throws IOException {
        this.studentDao = new StudentDaoImpl();
    }
    public Student findOne(String id) {

        return studentDao.findOne(id);
    }

    public List<Student> findAll() {
        return studentDao.findAll();
    }

    public Student update(Student student) {

        return studentDao.update(student);
    }

    public void delete(String id) {
        studentDao.delete(id);
    }

    public Student create(Student student) {
        System.out.println("IN Service !");
        if(student != null)
        return studentDao.create(student);
        else
            return null;
    }
}
