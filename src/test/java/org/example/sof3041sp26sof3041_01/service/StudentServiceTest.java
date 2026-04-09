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

    // updateStudent
    @Test
    void updateStudentWithValidStudent() {

        Student student = new Student(1, "A", 20, 9.0);
        studentService.addStudent(student);

        student.setName("B");
        student.setAge(21);
        student.setMark(8.0);

        studentService.updateStudent(student);

        assertEquals("B", studentService.getStudentById(student.getId()).getName());
        assertEquals(21, studentService.getStudentById(student.getId()).getAge());
        assertEquals(8.0, studentService.getStudentById(student.getId()).getMark());
    }

    @Test
    void updateStudentWithNull() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> studentService.updateStudent(null));
        assertEquals("Student can not be null", exception.getMessage());
    }

    @Test
    void updateStudentWithInvalidName() {

        Student student = new Student(1, "A", 20, 9.0);
        studentService.addStudent(student);

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                studentService.updateStudent(new Student(1, "", 20, 9.0)));
        assertEquals("Name must not be null or empty", exception.getMessage());

    }

    //
}