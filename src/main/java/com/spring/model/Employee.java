package com.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    private double salary;

    @ManyToOne
    @JoinColumn(name = "department_id",referencedColumnName = "id")
    @JsonIgnore
    private Department department;

    @OneToOne
    @JoinColumn(name="user_id")
    @JsonIgnore
    private User user;
}
