package com.shesh.db.utils;

import com.shesh.db.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shesh on 5/23/17.
 */
public final class GenerateData {

    static List<Student>  studentlist = new ArrayList<Student>();

    public static List<Student> studentData() throws Exception{

        String l;
        BufferedReader br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream("input/studentdata")));
        while( (l = br.readLine()) != null){
            Student s = new Student();
            System.out.println("Line is :"+l);
            String[] attributes = l.split(",");
            s.setFirstName(attributes[0]);
            s.setLastName(attributes[1]);
            s.setGender(attributes[3]);
            s.setAddress(attributes[2]);
            studentlist.add(s);

        }
        return studentlist;
    }

}
