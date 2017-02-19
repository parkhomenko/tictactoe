package com.hillel.projects.homework20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        City odessa = new City("Odessa", 1, new Date(1835, 8, 25));
        City lvov = new City("Lvov", 2, new Date(1535, 8, 25));

        Student john = new Student("John", 30, odessa);
        Student sam = new Student("Sam", 25, lvov);
        Student kathy = new Student("Kathy", 23, lvov);

        List<Student> students = new ArrayList<>();
        students.add(john);
        students.add(sam);
        students.add(kathy);

        Collections.sort(students);
    }
}
