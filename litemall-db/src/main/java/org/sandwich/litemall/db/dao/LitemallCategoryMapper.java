package org.sandwich.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sandwich.litemall.db.domain.LitemallCategory;
import org.sandwich.litemall.db.domain.LitemallCategoryExample;

public interface LitemallCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    long countByExample(LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Integer key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int insert(LitemallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int insertSelective(LitemallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCategory selectOneByExample(LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCategory selectOneByExampleSelective(@Param("example") LitemallCategoryExample example, @Param("selective") LitemallCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallCategory> selectByExampleSelective(@Param("example") LitemallCategoryExample example, @Param("selective") LitemallCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    List<LitemallCategory> selectByExample(LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCategory selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallCategory.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    LitemallCategory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCategory selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") LitemallCategory record, @Param("example") LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") LitemallCategory record, @Param("example") LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallCategory record, @Param("example") LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallCategory record, @Param("example") LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") LitemallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") LitemallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_category
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}