package edu.neu.cs4500.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import edu.neu.cs4500.model.User;

@RestController
public class UserService {
  static List<User> users = new ArrayList<>();

  @GetMapping("/api/user")
  public List<User> findAllUsers(){
    return users;
  }

  @GetMapping("api/user/{userId}")
  public User findUserById(@PathVariable("userId") Integer id) {
    for (User u : users) {
      if (u.getId() == id) {
        return u;
      }
    }
    return null;
  }
}
