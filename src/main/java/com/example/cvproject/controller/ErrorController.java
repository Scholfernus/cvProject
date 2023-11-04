package com.example.cvproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        // Tutaj możesz dodać logikę obsługi błędów, na przykład zapisywanie informacji o błędzie do logów.
        return "error";
    }
    public String getErrorPath() {
        return "/error";
    }
}
