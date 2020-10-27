package com.etc.dao;

import com.etc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDaoMapper {
    List<User> findAllByCondition(@Param("id") Integer id);
}
