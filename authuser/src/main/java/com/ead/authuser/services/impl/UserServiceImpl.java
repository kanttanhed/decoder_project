package com.ead.authuser.services.impl;

import com.ead.authuser.repository.UserModelRepository;
import com.ead.authuser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserModelRepository userModelRepository;

}