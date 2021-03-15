package com.example.dd.shiti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PerconController {
    @Autowired
    private PersonRepository personRepository;


    @GetMapping( "/save")
    public user addPerson(user user) {
        personRepository.save(user);
        return  personRepository.save(user);
    }
  @GetMapping("/update")
    public user update(Integer id,Integer age,String name){
        Optional<user> entity=personRepository.findById(id);
       user user =entity.get();
       user.setName(name);
       return personRepository.save(user);
  }
    @GetMapping("/list")
    public Iterable list() {
        return personRepository.findAll();
    }
    @GetMapping("/del")
    public boolean del(Integer id) {
        personRepository.deleteById(id);
        return true;
    }
    }