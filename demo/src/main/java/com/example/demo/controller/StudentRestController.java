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
import java.lang.String;

@RestController
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public List<Student> listStudent(HttpServletRequest request, HttpServletResponse rp) {
       return studentRepository.findAll();

    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(HttpServletRequest request, HttpServletResponse rp) {
       return "Hello world ^^";

    }


}
