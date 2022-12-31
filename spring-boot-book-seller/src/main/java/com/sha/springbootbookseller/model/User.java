package com.sha.springbootbookseller.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/*
    *@Author sa
    *@Date 30.12.2022
    *@Time 23:15
 */
@Data
@Entity
@Table(name = "users") //don't use user because user is reserved name on PostgreSQL.
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;

    @Column(name = "password",nullable = false,length = 100)
    private String password;
    @Column(name = "name",nullable = false,length = 100)
    private String name;
    @Column(name = "create_time",nullable = false)
    private LocalDateTime createTime;

    //role
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;
}
