package com.example.order.mapper;

import com.example.model.CmsTopicCategory;
import com.example.model.CmsTopicCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsTopicCategoryMapper {
    long countByExample(CmsTopicCategoryExample example);

    int deleteByExample(CmsTopicCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicCategory row);

    int insertSelective(CmsTopicCategory row);

    List<CmsTopicCategory> selectByExample(CmsTopicCategoryExample example);

    CmsTopicCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") CmsTopicCategory row, @Param("example") CmsTopicCategoryExample example);

    int updateByExample(@Param("row") CmsTopicCategory row, @Param("example") CmsTopicCategoryExample example);

    int updateByPrimaryKeySelective(CmsTopicCategory row);

    int updateByPrimaryKey(CmsTopicCategory row);
}