package org.example.AccessDB;

import org.example.Entity.Course;
import org.example.Entity.Database;

public interface CourseDao {
    public void add(Course course, Database database);
}

