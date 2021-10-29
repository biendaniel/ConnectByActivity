package com.onwelo.hackathon.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Review {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    Long id;

    @Column
    Integer rate; // 1-5

    @Column
    String comment;
}
