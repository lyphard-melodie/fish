package cn.itcast.dao.cargo;

import cn.itcast.domain.cargo.ContractProduct;

public interface ContractProductDao {
    int deleteByPrimaryKey(String id);

    int insert(ContractProduct record);

    int insertSelective(ContractProduct record);

    ContractProduct selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ContractProduct record);

    int updateByPrimaryKey(ContractProduct record);
}