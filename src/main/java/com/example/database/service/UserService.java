package com.example.database.service;

import com.example.database.bo.CreateUserRequest;
import com.example.database.bo.UserResponse;
import com.example.database.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAllUsers();
    UserResponse createUser (CreateUserRequest request);
    UserResponse updateStatus (Long id, String status);
}
