package com.Sedes.SedesApp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Setter
@Getter
public class User {
    @Id
    private long id;
    private String login;
    private String email;
    private String password;
    private String type;
}
