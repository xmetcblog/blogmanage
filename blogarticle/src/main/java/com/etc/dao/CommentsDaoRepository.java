package com.etc.dao;

import com.etc.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface CommentsDaoRepository extends JpaRepository<Comments, Integer>, JpaSpecificationExecutor<Comments>, Serializable {
}
