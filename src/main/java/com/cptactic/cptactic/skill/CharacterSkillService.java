package com.cptactic.cptactic.skill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cptactic.cptactic.cpcharacter.CharacterRepository;

@Service
public class CharacterSkillService {
    @Autowired
    CharacterRepository characterRepository;
    public CharacterSkillService(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }
}
