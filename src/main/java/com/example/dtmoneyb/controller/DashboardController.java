package com.example.dtmoneyb.controller;

import com.example.dtmoneyb.controller.dto.DashboardResponseDTO;
import com.example.dtmoneyb.services.DashboardServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/dashboard")
@RequiredArgsConstructor
public class DashboardController {

    private final DashboardServices dashboardServices;

    @GetMapping
    public DashboardResponseDTO getDash() {
        return dashboardServices.getDashboard();
    }

}
