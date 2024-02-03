package org.example.springmvcdemo.controllers;

import org.example.springmvcdemo.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    private Task model = new Task();

    @GetMapping("/view")
    public String viewTask(Model model) {
        model.addAttribute("task", this.model);
        return "task";
    }

    @PostMapping("/complete")
    public String completeTask() {
        model.setStatus(true);
        return "redirect:/tasks/view";
    }
}