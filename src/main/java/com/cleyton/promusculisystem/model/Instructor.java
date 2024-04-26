package com.cleyton.promusculisystem.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_instructors")
@Data
public class Instructor {

    @Id
    @GeneratedValue(generator = "native", strategy = GenerationType.AUTO)
    @GenericGenerator(name = "native")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer id;
    @Column(length = 60, nullable = false)
    private String name;
    @Column(nullable = false)
    private BigDecimal salary;
    @Column(length = 11, nullable = false, unique = true)
    private String cpf;
    private Boolean active;
    private String phone;
    private LocalDateTime createdAt;

//    @OneToMany(mappedBy = "workoutClasses", fetch = FetchType.LAZY)
//    private Set<WorkoutDance> workoutDances;
//    @OneToMany(mappedBy = "user")
//    @JsonIgnore
//    private Set<DanceClass> danceClasses;
}