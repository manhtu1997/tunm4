package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> listStudent(HttpServletRequest request, HttpServletResponse rp) {
       return studentRepository.findAll();

    }


}
