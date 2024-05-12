package com.cleyton.promusculisystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "tb_dance_classes")
public class DanceClass {
    @Id
    @GeneratedValue(generator = "native", strategy = GenerationType.AUTO)
    @GenericGenerator(name = "native")
    @JsonIgnore
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;
    @Column(length = 60)
    private String name;
    @Column(name = "dt_start")
    private LocalDateTime start;
    @Column(name = "dt_end")
    private LocalDateTime end;
    @Column(length = 100)
    private String description;
}
