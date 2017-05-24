package com.shesh.db.main;

import com.shesh.db.model.Student;
import com.shesh.db.utils.GenerateData;
import com.shesh.db.service.StudentServiceImpl;
import com.shesh.db.service.StudentService;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by shesh on 5/23/17.
 */
public class DatabaseStarter {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("MainLogger");

        GenerateData<Student> gen = new GenerateData<Student>(new Student());
        List<Student> studentList = gen.checkInstance();
        StudentService studentService = new StudentServiceImpl();

        for(Student student : studentList)studentService.create(student);

        logger.info("test complete");

    }
}
