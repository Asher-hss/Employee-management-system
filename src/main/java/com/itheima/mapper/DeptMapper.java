package com.itheima.mapper;

import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Select("select * from dept")
    List<Dept> list();

    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    @Insert("INSERT INTO dept(NAME, CREATE_TIME, UPDATE_TIME) VALUES (#{name},#{createTime},#{updateTime})")
    void insert(Dept dept);

    @Select("SELECT * FROM dept WHERE id = #{id}")
    Dept getByID(Integer id);

    @Update(("UPDATE dept SET name = #{name}, update_time = #{updateTime} WHERE id = #{id}"))
    void update(Dept dept);
}
