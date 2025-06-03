package com.viago.controller;

import com.viago.service.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin("*")
@Tag(name = "User API's")
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;
    private final CaptainService captainService;
    private final PassengerService passengerService;
    private final RideService rideService;
    private final MailService mailService;

    public UserController(UserService userService, CaptainService captainService, PassengerService passengerService, RideService rideService, MailService mailService) {
        this.userService = userService;
        this.captainService = captainService;
        this.passengerService = passengerService;
        this.rideService = rideService;
        this.mailService = mailService;
    }
}
