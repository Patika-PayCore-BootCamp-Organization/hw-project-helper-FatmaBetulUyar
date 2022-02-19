package com.patika.paycore.HelperProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipient {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
