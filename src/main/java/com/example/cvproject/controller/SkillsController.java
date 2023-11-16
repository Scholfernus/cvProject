package com.example.cvproject.controller;

import com.example.cvproject.model.SkillsModel;
import com.example.cvproject.service.SkillsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping(value = "/skills")
public class SkillsController {
    private SkillsService skillsService;

    @GetMapping
    public String getSkills() {
        return "skills/skills";
    }

    @PostMapping("/addSkill")
    public String addSkill(SkillsModel model) {
        skillsService.addSkillToList(model);
        return "skills/skills";
    }
    @GetMapping("/addSkill")
    public String getAddSkill(){
        skillsService.getAddSkill();
        return "skills/skills";
    }

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
