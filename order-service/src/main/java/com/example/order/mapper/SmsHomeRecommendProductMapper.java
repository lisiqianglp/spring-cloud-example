package com.example.order.mapper;

import com.example.model.SmsHomeRecommendProduct;
import com.example.model.SmsHomeRecommendProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmsHomeRecommendProductMapper {
    long countByExample(SmsHomeRecommendProductExample example);

    int deleteByExample(SmsHomeRecommendProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeRecommendProduct row);

    int insertSelective(SmsHomeRecommendProduct row);

    List<SmsHomeRecommendProduct> selectByExample(SmsHomeRecommendProductExample example);

    SmsHomeRecommendProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SmsHomeRecommendProduct row, @Param("example") SmsHomeRecommendProductExample example);

    int updateByExample(@Param("row") SmsHomeRecommendProduct row, @Param("example") SmsHomeRecommendProductExample example);

    int updateByPrimaryKeySelective(SmsHomeRecommendProduct row);

    int updateByPrimaryKey(SmsHomeRecommendProduct row);
}