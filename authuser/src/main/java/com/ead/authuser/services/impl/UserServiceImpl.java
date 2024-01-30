package com.ead.authuser.services.impl;

import com.ead.authuser.models.UserModel;
import com.ead.authuser.repository.UserModelRepository;
import com.ead.authuser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserModelRepository userModelRepository;

    @Override
    public List<UserModel> findAll() {
        return userModelRepository.findAll();
    }

    @Override
    public Optional<UserModel> findById(UUID userId) {
        return userModelRepository.findById(userId);
    }

    @Override
    public void deleteUser(UserModel userModel) {
        userModelRepository.delete(userModel);
    }
}