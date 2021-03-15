package com.example.dd;

import com.example.dd.shiti.PersonRepository;
import com.example.dd.shiti.user;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;


@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration({  })
@TestExecutionListeners({
        DbUnitTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        DependencyInjectionTestExecutionListener.class})
@DbUnitConfiguration(databaseConnection  = "h2DataSource")

class DdApplicationTests  {
@Autowired
private PersonRepository personRepository;

    @Test
    public void t() throws Exception{}
    @Test
    void addPerson() {
        user user = new user();
        user.setId(1);
        user.setName("张三");
        user.setAge(19);
        personRepository.save(user);
        Assert.assertEquals("张三",user.getName());
    }


}
