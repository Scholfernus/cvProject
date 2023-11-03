package com.example.cvproject.controller;

import com.example.cvproject.model.ExperienceModel;
import com.example.cvproject.service.ExperienceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/experience")
public class ExperienceController {
    private final ExperienceService expService;

    public ExperienceController(ExperienceService expService) {
        this.expService = expService;
    }

    @GetMapping
    public String getExperienceList(Model model) {
        List<ExperienceModel> experienceList = expService.getExperienceList();
        model.addAttribute("experiences", experienceList);
        return "experience/experience";
    }

    @PostMapping("/add")
    public RedirectView postAddExperience(@RequestBody ExperienceModel addExperienceModel) {
        expService.addNewExperience(addExperienceModel);
        return new RedirectView("/experience"); // Redirect to the list view
    }


    @PostMapping("/del/{id}")
    public RedirectView postDeleteExperienceById(@PathVariable("id") Long id) {
        expService.deleteById(id);
        return new RedirectView("experience/experience");
    }

    @PostMapping("/edit/{id}")
    public RedirectView postEditExperienceById(@PathVariable("id") Long id, ExperienceModel model) {
        expService.saveEditExperience(id, model);
        return new RedirectView("experience/experience");
    }

    @GetMapping("/edit/{id}")
    public String getEditExperience(@PathVariable("id") Long id, Model model) {
        Optional<ExperienceModel> experienceById = expService.getExperienceById(id);
        if (experienceById.isPresent()) {
            model.addAttribute("experience", experienceById);
            return "experience/edit";
        } else return "error";

    }
    @GetMapping("/addExperience")
    public String showAddForm() {
        return "experience/addExperience";
    }

}