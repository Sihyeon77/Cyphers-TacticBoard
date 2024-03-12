package com.cptactic.cptactic.cpcharacter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    @Autowired
    CharacterRepository characterRepository;   
    public CharacterService(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }
}
