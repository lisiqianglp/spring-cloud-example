package com.example.order.mapper;

import com.example.model.UmsMemberTask;
import com.example.model.UmsMemberTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UmsMemberTaskMapper {
    long countByExample(UmsMemberTaskExample example);

    int deleteByExample(UmsMemberTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTask row);

    int insertSelective(UmsMemberTask row);

    List<UmsMemberTask> selectByExample(UmsMemberTaskExample example);

    UmsMemberTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsMemberTask row, @Param("example") UmsMemberTaskExample example);

    int updateByExample(@Param("row") UmsMemberTask row, @Param("example") UmsMemberTaskExample example);

    int updateByPrimaryKeySelective(UmsMemberTask row);

    int updateByPrimaryKey(UmsMemberTask row);
}