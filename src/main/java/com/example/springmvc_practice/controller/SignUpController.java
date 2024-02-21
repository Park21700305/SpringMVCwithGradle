package com.example.springmvc_practice.controller;

import com.example.springmvc_practice.model.SignUpForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @ModelAttribute("signUpForm")
    public SignUpForm setSignUpForm() {
        return new SignUpForm();
    }

    @GetMapping("/showSignUpForm")
    public String showForm() {
        return "signup-form";
    }

    @PostMapping("/saveSignUpForm")
    public String saveUser(@ModelAttribute("signUpForm") SignUpForm signUpForm, Model model) {

        System.out.println("FirstName : " + signUpForm.getFirstName());
        System.out.println("LastName : " + signUpForm.getLastName());
        System.out.println("Username : " + signUpForm.getUserName());
        System.out.println("Password : " + signUpForm.getPassword());
        System.out.println("Email : " + signUpForm.getEmail());

        model.addAttribute("message", "User SignUp successfully.");
        model.addAttribute("user", signUpForm);

        return "signup-success";
    }
}