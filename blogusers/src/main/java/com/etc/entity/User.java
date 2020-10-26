package com.etc.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "username")
    private String userName;

    @Column(name = "nickname")
    private String nickName;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private Integer enabled;

    @Column(name = "email")
    private String email;

    @Column(name = "userface")
    private String userFace;

    @Column(name = "regtime")
    private String regTime;

    @Column(name = "role")
    private Integer role;

}
