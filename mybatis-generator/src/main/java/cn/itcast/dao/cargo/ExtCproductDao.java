package cn.itcast.dao.cargo;

import cn.itcast.domain.cargo.ExtCproduct;

public interface ExtCproductDao {
    int deleteByPrimaryKey(String id);

    int insert(ExtCproduct record);

    int insertSelective(ExtCproduct record);

    ExtCproduct selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ExtCproduct record);

    int updateByPrimaryKeyWithBLOBs(ExtCproduct record);

    int updateByPrimaryKey(ExtCproduct record);
}