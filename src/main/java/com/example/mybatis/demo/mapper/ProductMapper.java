package com.example.mybatis.demo.mapper;

import com.example.mybatis.demo.domain.Product;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Tue Aug 20 14:25:24 CST 2019
     */
    @Delete({
        "delete from product",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Tue Aug 20 14:25:24 CST 2019
     */
    @Insert({
        "insert into product (name, ",
        "price, categories)",
        "values (#{name,jdbcType=VARCHAR}, ",
        "#{price,jdbcType=NUMERIC}, #{categories,jdbcType=SMALLINT})"
    })
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Tue Aug 20 14:25:24 CST 2019
     */
    @InsertProvider(type=ProductSqlProvider.class, method="insertSelective")
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Tue Aug 20 14:25:24 CST 2019
     */
    @Select({
        "select",
        "id, name, price, categories",
        "from product",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.NUMERIC),
        @Result(column="categories", property="categories", jdbcType=JdbcType.SMALLINT)
    })
    Product selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Tue Aug 20 14:25:24 CST 2019
     */
    @UpdateProvider(type=ProductSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated Tue Aug 20 14:25:24 CST 2019
     */
    @Update({
        "update product",
        "set name = #{name,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=NUMERIC},",
          "categories = #{categories,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Product record);

    //    for example insert/delete/update/select


    @Select(value = {"<script>"
        + "select *from product p "
        + "<where> "
        + "<if test=\"id != null and id !='' \" > and p.id =#{id} </if>"
        + "<if test=\"name != null and name !='' \" > and p.name =#{name} </if>"
        + "</where>"
        + "</script>"})
    List<Product> selectProductList(Product record);
}