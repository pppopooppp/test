package com.wisform.controller;
import com.wisform.dao.PersonRepository;
import com.wisform.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*
@RestController//请求处理类
@RequestMapping("/helloWorld")
public class HelloWorldController {
    @GetMapping("/test")
    public String test(){
        return "hello world";
    }

    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/createNode")
    public Object createNode(@RequestParam(value = "nodeName") String nodeName) {
        Person person=new Person(nodeName);
        return personRepository.save(person);
    }
    @GetMapping("/checkNaPerson")
    public boolean checkNaPerson() {
        boolean existsNaPerson = personRepository.existsByName("na");
        return existsNaPerson;
    }
}*/