package com.bank.app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

@RequestMapping("/api")
public class HealthController {


    @GetMapping("/v1/health")
    public Map<String,String> getHeathReport()
    {
        HashMap<String,String> healthInfoMap = new HashMap<>();
        healthInfoMap.put("status","UP");
        healthInfoMap.put("service","Smart Bank API");

        return healthInfoMap;

    }

}
