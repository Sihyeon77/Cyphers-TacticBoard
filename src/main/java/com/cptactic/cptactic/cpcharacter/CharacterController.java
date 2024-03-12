package com.cptactic.cptactic.cpcharacter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/api/character")
public class CharacterController {
    @Autowired
    CharacterService characterService;

    public CharacterController(CharacterService characterService){
        this.characterService = characterService;
    }

    
}
