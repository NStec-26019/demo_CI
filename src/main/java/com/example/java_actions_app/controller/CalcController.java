package com.example.java_actions_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalcController {

  // わざとインデントを崩す例
  @GetMapping("/calc")
  public String showForm() {
    return "calc";
  }
}
