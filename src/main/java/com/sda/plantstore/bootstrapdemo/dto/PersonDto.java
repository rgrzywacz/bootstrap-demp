package com.sda.plantstore.bootstrapdemo.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String profession;
    private String favoriteColor;

}

