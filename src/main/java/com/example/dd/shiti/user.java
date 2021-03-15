package com.example.dd.shiti;

import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "test")
public class user {
@Id
    private Integer id;
    private Integer age;
    private String name;




}
