package com.cptactic.cptactic.skill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
    @Autowired
    SkillRepository skillRepository;
    public SkillService(SkillRepository skillRepository){
        this.skillRepository = skillRepository;
    }
}
