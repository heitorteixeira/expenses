package com.expenses.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "user", nullable = false)
    private String user;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "created", nullable = false)
    private Instant created;

    @Column(name = "phone", nullable = false)
    private String phone;
}
