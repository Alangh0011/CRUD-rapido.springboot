package com.example.crudrapido.controller;

import com.example.crudrapido.entity.Student;
import com.example.crudrapido.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class studentController {
    @Autowired
    private studentService StudentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return StudentService.getAllStudents();
    }

    @GetMapping("/{StudentId}")
    public Optional<Student> getBId(@PathVariable("StudentId") Long studentId) {
        return StudentService.getStudent(studentId);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Student student) {
        StudentService.saveOrUpdate(student);
    }

    @DeleteMapping("/{StudentId}")
    public void delete(@PathVariable("StudentId") Long StudentId) {
        StudentService.delete(StudentId);
    }

}
