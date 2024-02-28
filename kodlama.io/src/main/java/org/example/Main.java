package org.example;

import org.example.AccessDB.CourseDao;
import org.example.AccessDB.HibernateDao;
import org.example.AccessDB.JdbcDao;
import org.example.Business.CourseManager;
import org.example.Entity.Database;
import org.example.Logging.DBLogger;
import org.example.Logging.FileLogger;
import org.example.Logging.ILogger;
import org.example.Logging.MailLogger;
import org.example.Entity.Course;

import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        CourseDao firstDao = new HibernateDao();
        CourseDao secondDao = new JdbcDao();

        ILogger logger1 = new DBLogger();
        ILogger logger2 = new MailLogger();
        ILogger logger3 = new FileLogger();

        CourseManager manager = new CourseManager(firstDao, database, logger1);

        // it throws error message
        Course c0 = new Course("C++", 0);
        manager.add(c0);

        // it gives the correct addition
        Course c1 = new Course("Python", 15);
        manager.add(c1);

    }
}