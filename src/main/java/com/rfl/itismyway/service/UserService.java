package com.rfl.itismyway.service;

import com.rfl.itismyway.model.User;
import com.rfl.itismyway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public List<User> getAll() {
        return repository.findAll();
    }
}
