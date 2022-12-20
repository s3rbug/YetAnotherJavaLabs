/*
 * ІО-01 Бугайчук Сергій
 * Лабораторна робота №4
 * Варіант - 10
 * С11 - 10 => визначити клас студент, який складається як мінімум з 5-и полів
 * */

import Student.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(20, "Mike", 3, "Course3", new String[]{"Lesson1"}),
                new Student(18, "John", 4, "Course1", new String[]{"Lesson1", "Lesson4"}),
                new Student(21, "Tim", 2, "Course2", new String[]{"Lesson1", "Lesson3"}),
                new Student(19, "Kim", 1, "Course5", new String[]{"Lesson2", "Lesson2"}),
                new Student(22, "Sam", 5, "Course4", new String[]{"Lesson5", "Lesson2"}),
        };
        System.out.println("Default order:");
        Student.printStudents(students);
        Arrays.sort(students, Comparator.comparing(Student::getAge));
        System.out.println("Sorted by age:");
        Student.printStudents(students);
        Arrays.sort(students, Comparator.comparing(Student::getCourse).reversed());
        System.out.println("Sorted by course:");
        Student.printStudents(students);
    }
}
