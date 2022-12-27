package com.example.springjpa;

import org.springframework.data.repository.CrudRepository;
//Interface Of getting CRUD REPOSITORY
public interface UserOperations extends CrudRepository<Users,Integer> {
}
