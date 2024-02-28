package org.example.Entity;

import java.util.ArrayList;
import java.util.List;

public class Database {
    // A database must keep all other entities records.
    public List<String> courseNames;
    public List<String> categoryNames;
    public List<String> instructorNames;

    public Database() {
        courseNames = new ArrayList<>();
        categoryNames = new ArrayList<>();
        instructorNames = new ArrayList<>();

        System.out.println("DB activated!");
    }
}
