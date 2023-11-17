package com.example.cvproject.controller;

import com.example.cvproject.model.SkillsModel;
import com.example.cvproject.service.SkillsService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping(value = "/skills")
@Slf4j
public class SkillsController {
    private static final Logger logger = LoggerFactory.getLogger(SkillsController.class);
    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @GetMapping
    public String getSkills() {
        return "skills/skills";
    }
    @GetMapping("/add")
    public String getAddSkill(Model model) {
        logger.debug("Entering getAddSkill method");
        skillsService.getAddSkill();
        model.addAttribute("someAttribute", "someValue");
        // Zwróć widok, który ma obsłużyć formularz dodawania umiejętności
        return "skills/addSkill";
    }
    @PostMapping("/addSkill")
    public String addSkill(SkillsModel model) {
        skillsService.addSkillToList(model);
        return "skills/skills";
    }
//    @GetMapping("/add")
//    public String getAddSkill(){
//        skillsService.getAddSkill();
//        return "skills/addSkill";
//    }

    @PostMapping("/del/{id}")
    public RedirectView deleteSkillById(@PathVariable("id") Long id) {
        skillsService.deleteById(id);
        return new RedirectView("skills/skills");
    }

    @PostMapping("/edit/{id}")
    public RedirectView editSkillById(@PathVariable("id") Long id, SkillsModel model) {
        skillsService.editSkillById(model, id);
        return new RedirectView("skills/skills");
    }
}
