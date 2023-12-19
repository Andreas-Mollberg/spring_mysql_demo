package com.example.spring_mysql_demo.repositories;

import com.example.spring_mysql_demo.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
