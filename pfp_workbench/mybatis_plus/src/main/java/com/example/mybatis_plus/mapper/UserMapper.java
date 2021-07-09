package com.example.mybatis_plus.mapper;

import com.example.mybatis_plus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2021-07-08
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
