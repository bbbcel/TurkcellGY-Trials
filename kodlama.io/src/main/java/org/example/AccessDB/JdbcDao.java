package org.example.AccessDB;

import org.example.Entity.Course;
import org.example.Entity.Database;

public class JdbcDao implements CourseDao{

    @Override
    public void add(Course course, Database database) {
        System.out.println(course.name + " added to Database with Jdbc");
    }
}
