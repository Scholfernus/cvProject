package com.example.cvproject.controller;

import com.example.cvproject.model.SkillsModel;
import com.example.cvproject.repository.SkillsRepository;
import com.example.cvproject.service.SkillsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/skills")
public class SkillsController {
private SkillsService skillsService;
    @GetMapping
    public String getSkills(){
        return "skills/skills";
    }
    @PostMapping("/addSkill")
    public String addSkill(SkillsModel model){
    skillsService.addSkillToList(model);
    return "skills/skills";
    }
}
