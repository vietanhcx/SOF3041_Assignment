package org.example.sof3041sp26sof3041_01.service;

import org.example.sof3041sp26sof3041_01.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private StudentService studentService;

    @BeforeEach
    void setUp() {

        studentService = new StudentService();
    }

    // addStudent()
    @Test
    void addStudentWithValidStudent() {

        Student student = new Student(1, "A", 20, 9.0);
        studentService.addStudent(student);

        assertEquals(1, studentService.getAllStudents().size());
        assertEquals(20, studentService.getStudentById(1).getAge());
    }

    @Test
    void addStudentWithNull() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> studentService.addStudent(null));
        assertEquals("Student can not be null", exception.getMessage());
    }

    @Test
    void addStudentWithInvalidAge() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Student(1, "A", 15, 9.0));
        assertEquals("Age must be greater than 18", exception.getMessage());

    }

    @Test
    void addStudentWithInvalidMark() {

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                studentService.addStudent(new Student(1, "A", 20, 11)));

        assertEquals("Mark must be between 0 and 10", exception.getMessage());

    }
}