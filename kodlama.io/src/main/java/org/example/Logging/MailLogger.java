package org.example.Logging;

import org.example.Entity.Category;
import org.example.Entity.Course;
import org.example.Entity.Instructor;

public class MailLogger implements ILogger{
    @Override
    public void log(Instructor instructor, Course course, Category category){
        System.out.println("Mail logger");
    }
}
