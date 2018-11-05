package org.lhyf.mybatis.mine_mapper;

import tk.mybatis.mapper.common.base.BaseSelectMapper;

/****
 * @author YF
 * @date 2018-11-04 12:19
 * @desc MyCustomMapper
 *
 **/
public interface MyCustomMapper<T>  extends BaseSelectMapper<T>,MyBatchUpdateMapper<T> {
}
