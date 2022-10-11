package cn.itcast.dao.cargo;

import cn.itcast.domain.cargo.Factory;
import cn.itcast.domain.cargo.FactoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FactoryDao {
    long countByExample(FactoryExample example);

    int deleteByExample(FactoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(Factory record);

    int insertSelective(Factory record);

    List<Factory> selectByExample(FactoryExample example);

    Factory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Factory record, @Param("example") FactoryExample example);

    int updateByExample(@Param("record") Factory record, @Param("example") FactoryExample example);

    int updateByPrimaryKeySelective(Factory record);

    int updateByPrimaryKey(Factory record);
}