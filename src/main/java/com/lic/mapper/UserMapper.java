package com.lic.mapper;

import com.lic.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author lichai
 * @date 18:04 2019/7/15
 */
@Mapper
@Repository
public interface UserMapper {

    User getUser(int id);
}
