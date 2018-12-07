package com.chao.ssm.mapper;

import com.chao.ssm.bean.UserDO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    UserDO selectById(@Param("id") String id);

}
