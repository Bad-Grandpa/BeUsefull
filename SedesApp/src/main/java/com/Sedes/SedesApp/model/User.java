package com.Sedes.SedesApp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class User {
    @Id
    private long id;
    private String Login;
    private String Email;
    private String Password;
    private String Type;
    private LocalDateTime LastLoggedIn;
    private LocalDateTime CreationDate;
}
