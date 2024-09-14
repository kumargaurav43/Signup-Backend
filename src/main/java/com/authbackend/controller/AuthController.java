package com.authbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authbackend.dto.LoginRequest;
import com.authbackend.dto.UserDto;
import com.authbackend.model.User;
import com.authbackend.repository.UserRepository;
//import com.authbackend.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
//	@Autowired
//    private UserService userService;
//
//    @PostMapping("/signup")
//    public ResponseEntity<String> signup(@RequestBody User user) {
//        userService.saveUser(user);
//        return ResponseEntity.ok("User registered successfully");
//    }
	@Autowired
    private UserRepository userRepository;

    // SignUp API
    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody UserDto userDto) {
        // Convert UserDto to User
        User user = new User();
        user.setName(userDto.getName());
        user.setNumber(userDto.getNumber());
        user.setEmail(userDto.getEmail());
        user.setStreet1(userDto.getStreet1());
        user.setStreet2(userDto.getStreet2());
        user.setCity(userDto.getCity());
        user.setPincode(userDto.getPincode());
        user.setCountry(userDto.getCountry());
        user.setPassword(userDto.getPassword());
//
//        // Save to MongoDB
        userRepository.save(user);

        return ResponseEntity.ok("User registered successfully.");
    }

    // Login API
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        // Check if user exists by email
        User user = userRepository.findByEmail(loginRequest.getEmail());

        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.ok("Login successful.");
        } else {
            return ResponseEntity.status(401).body("Invalid email or password.");
        }
    }
}
