package com.smartbank.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController

@RequestMapping("/api/v1")
//versioning should be at the class level
public class HealthController {

    //converting into responseEntity is good approach to send status code in the response.
    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> getHeathReport()
    {
        HashMap<String,Object> healthInfoMap = new HashMap<>();
        healthInfoMap.put("status","UP");
        healthInfoMap.put("service","Smart Bank API");
        healthInfoMap.put("TimeStamp", LocalDateTime.now());
        return ResponseEntity.ok(healthInfoMap);

    }

}
