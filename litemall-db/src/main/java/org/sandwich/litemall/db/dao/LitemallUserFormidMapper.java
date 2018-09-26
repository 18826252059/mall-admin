package org.sandwich.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sandwich.litemall.db.domain.LitemallUserFormid;
import org.sandwich.litemall.db.domain.LitemallUserFormidExample;

public interface LitemallUserFormidMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     */
    long countByExample(LitemallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") LitemallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Integer key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     */
    int insert(LitemallUserFormid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     */
    int insertSelective(LitemallUserFormid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallUserFormid selectOneByExample(LitemallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallUserFormid selectOneByExampleSelective(@Param("example") LitemallUserFormidExample example, @Param("selective") LitemallUserFormid.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallUserFormid> selectByExampleSelective(@Param("example") LitemallUserFormidExample example, @Param("selective") LitemallUserFormid.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     */
    List<LitemallUserFormid> selectByExample(LitemallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallUserFormid selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallUserFormid.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     */
    LitemallUserFormid selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") LitemallUserFormid record, @Param("example") LitemallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") LitemallUserFormid record, @Param("example") LitemallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallUserFormid record, @Param("example") LitemallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallUserFormid record, @Param("example") LitemallUserFormidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") LitemallUserFormid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") LitemallUserFormid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallUserFormid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_user_formid
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallUserFormid record);
}