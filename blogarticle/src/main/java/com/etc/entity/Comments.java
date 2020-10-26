package com.etc.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "comments")
@Data
public class Comments {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "aid")
    private Integer aid;
    @Column(name = "content")
    private String content;
    @Column(name = "publishDate")
    private Timestamp publishDate;
    @Column(name = "parentId")
    private Integer parentId;
    @Column(name = "uid")
    private Integer uid;


}
