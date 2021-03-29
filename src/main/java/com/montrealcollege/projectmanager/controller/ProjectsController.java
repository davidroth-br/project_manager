package com.montrealcollege.projectmanager.controller;

import com.montrealcollege.projectmanager.model.Projects;
import com.montrealcollege.projectmanager.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/projects")
public class ProjectsController {

    @Autowired
    private ProjectsService service;

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("project", new Projects());
        model.addAttribute("projectList", service.showProjects());
        return "WEB-INF/views/newProject";
    }

    @PostMapping("/test")
    public String validateForm(@ModelAttribute("project") @Valid Projects project,
                               BindingResult errors, Model model) {
        if (errors.hasErrors()) {
            return "WEB-INF/views/newProject";
        }
        service.addProject(project);
        model.addAttribute("projectName", project.getName());
        return "WEB-INF/views/result";
    }
}
