// Controller with a /health endpoint that returns a 200 OK response
package com.extendaretail.workshoprelevate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}