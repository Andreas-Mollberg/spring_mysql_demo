package com.example.spring_mysql_demo.controllers;

import com.example.spring_mysql_demo.models.User;
import com.example.spring_mysql_demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email){
        User user = new User(name, email);
        userRepository.save(user);
        return "Saved user";
    }

    @PutMapping(path = "/update/{id}")
    public @ResponseBody String updateUser(@PathVariable Integer id, @RequestParam String name, @RequestParam String email){
        var optionalUser = userRepository.findById(id);

        if (optionalUser.isEmpty()){
            return "NOT FOUND";
        }
        var user = optionalUser.get();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);

        return "Updated";
    }

    @DeleteMapping(path = "/delete")
    public @ResponseBody String deleteUser(@RequestParam Integer id){
        userRepository.deleteById(id);
        return "Deleted User ID: " + id;
    }


}
