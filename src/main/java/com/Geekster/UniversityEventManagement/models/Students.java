package com.Geekster.UniversityEventManagement.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "StudentId")
    private Integer studentId;
    @Column(name = "FirstName",unique = true)
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "age")
    @NotNull
    @Min(18)
    @Max(26)
    private Integer age;
    @Column(name = "department")
    private Enum department;
}
