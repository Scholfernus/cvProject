package com.example.cvproject.controller;

import com.example.cvproject.model.SkillsModel;
import com.example.cvproject.service.SkillsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/skills")
@Slf4j
public class SkillsController {
    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @GetMapping
    @ResponseBody
    public ModelAndView getSkills() {
        return new ModelAndView("skills/skills");
    }
    @GetMapping("/add")
    @ResponseBody
    public ModelAndView getAddSkill() {
        log.debug("Entering getAddSkill method");
        skillsService.getAddSkill();
        ModelAndView mav = new ModelAndView("skills/addSkill");
        mav.addObject("someAttribute", "someValue");
        // Zwróć widok, który ma obsłużyć formularz dodawania umiejętności
        return mav;
    }
    @PostMapping("/addSkill")
    public String addSkill(SkillsModel model) {
        skillsService.addSkillToList(model);
        return "redirect:skills/skills";
    }

    @PostMapping("/del/{id}")
    public String deleteSkillById(@PathVariable("id") Long id) {
        skillsService.deleteById(id);
        return "redirect:skills/skills";
    }

    @PostMapping("/edit/{id}")
    public String editSkillById(@PathVariable("id") Long id, SkillsModel model) {
        skillsService.editSkillById(model, id);
        return "redirect:skills/skills";
    }
}
