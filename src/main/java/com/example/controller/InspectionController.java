package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inspections")
public class InspectionController {

    @PostMapping
    public String create() {
        return "Inspection created";
    }

    @PutMapping("/{id}/status")
    public String updateStatus(@PathVariable Long id, @RequestParam String status) {
        return "Status updated to " + status;
    }

    @GetMapping
    public String getAll() {
        return "List of inspections";
    }
}
