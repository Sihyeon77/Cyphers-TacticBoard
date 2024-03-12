package com.cptactic.cptactic.skill;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Skill {
    @Id
    private String skillName;

    private String shape;
    private int value;
}
