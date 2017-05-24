package com.shesh.db.dao;

import com.shesh.db.model.Student;
import com.shesh.db.utils.DbUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Created by shesh on 5/23/17.
 */
public class StudentDaoImpl implements StudentDao {
    static EntityManagerFactory emf ;
    Logger logger ;
    EntityManager em;
    public StudentDaoImpl() throws IOException {
        Properties prop = DbUtil.getProp();
        emf = Persistence.createEntityManagerFactory("dbdemo", prop);

        this.logger = Logger.getLogger("DAO");
    }
    public Student findOne(String id) {
        return null;
    }

    public List<Student> findAll() {
        return null;
    }

    public Student update(Student student) {
        return null;
    }

    public void delete(String id) {

    }

    public Student create(Student student) {

        this.em = emf.createEntityManager();
        this.em.getTransaction().begin();
        this.em.persist(student);
        this.em.getTransaction().commit();
        logger.info("New object is created for : Student \t"+student.toString());
        return student;

    }
}
