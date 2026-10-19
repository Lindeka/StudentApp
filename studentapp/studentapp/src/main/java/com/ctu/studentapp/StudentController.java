package com.ctu.studentapp;
/**
 *
 * @author LindekaMntambo
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class StudentController {

    // Step 3 & 4: GET /api/hello returning a JSON response object
    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Welcome to JDC612 Software Engineering API");
        response.put("status", "Success");
        response.put("code", "200");
        return response; // Spring Boot automatically converts this Map to JSON
    }
}