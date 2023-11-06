package com.example.cvproject.controller;

import com.example.cvproject.model.EducationModel;
import com.example.cvproject.service.EducationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping(value = "/education")
public class EducationController {
private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping
    public String getEducation(Model model){
        List<EducationModel> educationList =educationService.getAllEducationList();
        model.addAttribute("education",educationList);
        return "education/education";
    }
    @GetMapping("/add")
    public String getAddEducationForm(Model model){
        model.addAttribute("educationModel", model);
        return "education/addEducation";
    }
    @PostMapping("/add")
    public String postAddEducation(EducationModel educationModel){
        educationService.addNewEducation(educationModel);
        return "education/education";
    }
    @PostMapping("/del/{id}")
    public RedirectView postDeleteEducationById(@PathVariable("id") Long id){
        educationService.deleteById(id);
        return new RedirectView("education/education");
    }
    @PostMapping("/edit/{id}")
    public RedirectView editEducationById(@PathVariable("id")Long id, EducationModel model){
        educationService.editEducationById(id, model);
        return new RedirectView("education/education");
    }
}
