package com.etc.dao;

import com.etc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;
import java.util.List;

public interface UserDaoRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User>, Serializable {
    User findUserByUserNameAndPassword(String username,String password);
    List<User> findAll();
}
