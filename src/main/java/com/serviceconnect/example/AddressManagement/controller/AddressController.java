package com.serviceconnect.example.AddressManagement.controller;

import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;


@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/user/{userId}")
    public String getRecommendationsForUser(@PathVariable Long userId) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        return "Address for user ID: " + inetAddress.getHostAddress(); // Example response
    }
}

