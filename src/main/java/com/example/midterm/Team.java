package com.example.midterm;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "teams")
public class Team {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "name")
    private String name;

    @Column(name = "carry")
    private String carry;

    @Column(name = "mider")
    private String mider;

    @Column(name = "offlaner")
    private String offlaner;

    @Column(name = "semisupport")
    private String semiSupport;

    @Column(name = "hardsupport")
    private String hardSupport;
}
