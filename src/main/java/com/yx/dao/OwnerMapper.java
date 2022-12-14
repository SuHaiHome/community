package com.yx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.model.Owner;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 */
@Component("ownerDao")
public interface OwnerMapper extends BaseMapper<Owner> {

    //查询
    List<Owner> queryOwnerAll(Owner owner);

    /**
     * 通过username查询owner
     */
    Owner queryOwnerByName(@Param("username") String username);

    void deleteOwnerUserByUserName(@Param("username2") String username);

    Owner queryOwnerById(@Param("id") long parseLong);
}
