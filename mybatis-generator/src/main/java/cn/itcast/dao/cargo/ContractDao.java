package cn.itcast.dao.cargo;

import cn.itcast.domain.cargo.Contract;

public interface ContractDao {
    int deleteByPrimaryKey(String id);

    int insert(Contract record);

    int insertSelective(Contract record);

    Contract selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}