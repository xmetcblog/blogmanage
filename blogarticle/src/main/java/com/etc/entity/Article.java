package com.etc.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "article")
@Data
public class Article {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "mdcontent")
    private String mdContent;

    @Column(name = "htmlcontent")
    private String htmlContent;

    @Column(name = "summary")
    private String summary;

    @Column(name = "cid")
    private Integer cid;

    @Column(name = "uid")
    private Integer uid;

    @Column(name = "publishdate")
    private Timestamp publishDate;

    @Column(name = "edittime")
    private Timestamp editTime;

    @Column(name = "state")
    private Integer state;

    @Column(name = "pageview")
    private Integer pageView;
}
