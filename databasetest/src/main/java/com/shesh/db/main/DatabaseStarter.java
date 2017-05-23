package com.shesh.db.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Logger;

/**
 * Created by shesh on 5/23/17.
 */
public class DatabaseStarter {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MainLogger");
        logger.info("Process Starting.. ");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbdemo");


    }
}
