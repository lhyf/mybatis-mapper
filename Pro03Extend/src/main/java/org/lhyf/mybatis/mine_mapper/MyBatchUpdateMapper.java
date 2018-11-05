package org.lhyf.mybatis.mine_mapper;

import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/****
 * @author YF
 * @date 2018-11-04 13:05
 * @desc MyBatchUpdateMapper
 *
 **/
public interface MyBatchUpdateMapper<T> {

    @UpdateProvider(type =MyBatchUpdateProvider.class,method = "dynamicSQL")
    void batchUpdate(List<T> list);
}
