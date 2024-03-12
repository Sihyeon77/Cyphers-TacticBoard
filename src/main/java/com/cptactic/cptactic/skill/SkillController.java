package com.cptactic.cptactic.skill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/api/skill")
public class SkillController {
    @Autowired
    SkillService skillService;
    @Autowired
    CharacterSkillService characterSkillService;

    public SkillController(SkillService skillService, CharacterSkillService characterSkillService){
        this.skillService = skillService;
        this.characterSkillService =characterSkillService;
    }


}
