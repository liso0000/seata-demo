package com.demo.dao;

import com.demo.entity.TblOne;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TblOneDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TblOne record);

    int insertSelective(TblOne record);

    TblOne selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TblOne record);

    int updateByPrimaryKey(TblOne record);
}