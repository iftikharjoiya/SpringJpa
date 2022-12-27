package com.example.springjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringJpaApplication {

    public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(SpringJpaApplication.class, args);
        UserOperations userOperations=context.getBean(UserOperations.class);
        Users users=new Users();
        users.setUserName("Iftikhar");
        users.setUserCity("Haroonabad");
        Users users1=new Users();
        users1.setUserName("Asad");
        users1.setUserCity("Karachi");
        //Saving Data....
        userOperations.save(users);
        userOperations.save(users1);
        //Read All Data....
        List<Users> list= (List<Users>) userOperations.findAll();
        for (Users user:list
             ) {
            System.out.println(user);
        }
        //Updating Data.....
        Optional<Users> optional=userOperations.findById(1);
        Users users2=optional.get();
        users2.setUserName("Joyia");
        userOperations.save(users2);


    }

}
