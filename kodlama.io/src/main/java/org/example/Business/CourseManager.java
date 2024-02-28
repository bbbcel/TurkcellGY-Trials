package org.example.Business;

import org.example.AccessDB.CourseDao;
import org.example.Entity.Course;
import org.example.Entity.Database;
import org.example.Logging.ILogger;

public class CourseManager {
    CourseDao courseDao; // the pointer to courseDao
    ILogger iLogger;
    Database database;

    public CourseManager(CourseDao courseDao, Database database, ILogger iLogger) {
        this.courseDao = courseDao;
        this.database = database;
        this.iLogger = iLogger;
    }

    public void add(Course course){
        boolean containsSearchStr = database.courseNames.stream().anyMatch(course.name::equalsIgnoreCase);
        if(course.price<=0){
            System.out.println(course.name + ":Course price can't be lower than zero nor zero.");
        } else if (containsSearchStr) {
            System.out.println(course.name + "Course name can't be repeated.");
        }
        else{
            System.out.println(course.name + "Will be added to db.");
            courseDao.add(course, database);
        }
    }
}
