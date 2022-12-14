package com.yx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.model.PropertyInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 */
@Component("propertyInfoDao")
public interface PropertyInfoMapper extends BaseMapper<PropertyInfo> {

    /**
     * 根据登记时间和房子id当前记录信息
     */
    void deleteByHouIdAndTime( @Param("houId") Integer houId, @Param("endDate") String onTime);

    List<PropertyInfo> queryListAll(PropertyInfo propertyInfo);
}
