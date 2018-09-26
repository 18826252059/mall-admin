package org.sandwich.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sandwich.litemall.db.domain.LitemallKeyword;
import org.sandwich.litemall.db.domain.LitemallKeywordExample;

public interface LitemallKeywordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    long countByExample(LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Integer key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int insert(LitemallKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int insertSelective(LitemallKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallKeyword selectOneByExample(LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallKeyword selectOneByExampleSelective(@Param("example") LitemallKeywordExample example, @Param("selective") LitemallKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallKeyword> selectByExampleSelective(@Param("example") LitemallKeywordExample example, @Param("selective") LitemallKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    List<LitemallKeyword> selectByExample(LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallKeyword selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    LitemallKeyword selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallKeyword selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") LitemallKeyword record, @Param("example") LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") LitemallKeyword record, @Param("example") LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallKeyword record, @Param("example") LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallKeyword record, @Param("example") LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") LitemallKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") LitemallKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_keyword
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}