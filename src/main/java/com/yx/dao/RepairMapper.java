package com.yx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.model.Repair;
import com.yx.model.Tongji;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 */
@Component("repairDao")
public interface RepairMapper extends BaseMapper<Repair> {

    List<Repair> queryRepairAll(Repair repair);

    //统计处理
    List<Tongji> queryTongji();

}
