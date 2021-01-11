package com.example.demo.dao;

import com.example.demo.dataobject.ItemStockDO;
import org.springframework.data.repository.query.Param;

public interface ItemStockDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemStockDO record);

    int insertSelective(ItemStockDO record);

    ItemStockDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemStockDO record);

    int updateByPrimaryKey(ItemStockDO record);

    ItemStockDO selectByItemId(Integer itemId);

    int decreaseStock(@org.apache.ibatis.annotations.Param ("itemId")Integer itemId, @org.apache.ibatis.annotations.Param ("amount")Integer amount);
}