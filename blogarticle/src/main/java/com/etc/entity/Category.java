package com.etc.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "category")
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "catename")
    private String cateName;

    @Column(name = "date")
    private String date;

}
