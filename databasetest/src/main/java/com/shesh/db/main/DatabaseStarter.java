package com.shesh.db.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.*;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Created by shesh on 5/23/17.
 */
public class DatabaseStarter {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("MainLogger");
        logger.info("Process Starting.. ");
        Properties prop = new Properties();
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("config.properties");

        prop.load(inputStream);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbdemo",prop);
        logger.info("test complete");

    }
}
