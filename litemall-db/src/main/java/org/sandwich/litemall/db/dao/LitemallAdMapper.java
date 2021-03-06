package org.sandwich.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sandwich.litemall.db.domain.LitemallAd;
import org.sandwich.litemall.db.domain.LitemallAdExample;

public interface LitemallAdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     */
    long countByExample(LitemallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") LitemallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Integer key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     */
    int insert(LitemallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     */
    int insertSelective(LitemallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallAd selectOneByExample(LitemallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallAd selectOneByExampleSelective(@Param("example") LitemallAdExample example, @Param("selective") LitemallAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallAd> selectByExampleSelective(@Param("example") LitemallAdExample example, @Param("selective") LitemallAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     */
    List<LitemallAd> selectByExample(LitemallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallAd selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallAd.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     */
    LitemallAd selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallAd selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") LitemallAd record, @Param("example") LitemallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") LitemallAd record, @Param("example") LitemallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallAd record, @Param("example") LitemallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallAd record, @Param("example") LitemallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") LitemallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") LitemallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallAd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallAdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_ad
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}