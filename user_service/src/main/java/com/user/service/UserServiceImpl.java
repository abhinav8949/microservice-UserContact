package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

//    Fake User List
    List<User> list= List.of(
            new User(1311L,"Shyam", "829286"),
            new User(1312L,"Ritik", "78963"),
            new User(1313L,"Monu", "123453"),
            new User(1314L,"Arun", "876544"),
            new User(1315L,"Rahul", "97333")
    );


    @Override
    public User getUserById(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
