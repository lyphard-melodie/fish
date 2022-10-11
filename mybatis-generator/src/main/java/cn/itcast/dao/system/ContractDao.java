package cn.itcast.dao.system;

import cn.itcast.domain.system.Contract;
import cn.itcast.domain.system.ContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractDao {
    long countByExample(ContractExample example);

    int deleteByExample(ContractExample example);

    int deleteByPrimaryKey(String id);

    int insert(Contract record);

    int insertSelective(Contract record);

    List<Contract> selectByExample(ContractExample example);

    Contract selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByExample(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}