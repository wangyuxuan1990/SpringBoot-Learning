package com.wangyuxuan.domain;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/11/8 14:13
 * @Description:
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name, jdbcType=VARCHAR}, #{age, jdbcType=INTEGER})")
    int insertByMap(Map<String, Object> map);

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insertByUser(User user);

    @Delete("DELETE FROM USER WHERE ID = #{id}")
    void delete(Long id);

    @Update("UPDATE USER SET AGE = #{age} WHERE NAME = #{name}")
    void update(User user);

    @Results({@Result(property = "name", column = "NAME"), @Result(property = "age", column = "AGE")})
    @Select("SELECT NAME, AGE FROM USER")
    List<User> findAll();
}
