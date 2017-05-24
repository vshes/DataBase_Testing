package com.shesh.db.main;

import com.shesh.db.model.Student;
import com.shesh.db.service.StudentService;
import com.shesh.db.service.StudentServiceImpl;
import com.shesh.db.utils.GenerateData;

import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Persistence;
import java.io.*;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Created by shesh on 5/23/17.
 */
public class DatabaseStarter {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("MainLogger");
        //generate
        List<Student> slist = GenerateData.studentData();
        StudentService studentService = new StudentServiceImpl();
        for(Student student : slist)studentService.create(student);

        logger.info("test complete");

    }
}
