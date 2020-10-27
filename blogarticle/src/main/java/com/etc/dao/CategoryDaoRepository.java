package com.etc.dao;

import com.etc.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;
import java.util.List;

public interface CategoryDaoRepository extends JpaRepository<Category, Integer>, JpaSpecificationExecutor<Category>, Serializable {
    Category findAllById(Integer id);
    List<Category> findAll();
}
