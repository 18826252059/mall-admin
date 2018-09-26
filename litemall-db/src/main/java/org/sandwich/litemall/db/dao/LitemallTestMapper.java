package org.sandwich.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.sandwich.litemall.db.domain.LitemallTest;
import org.sandwich.litemall.db.domain.LitemallTestExample;

public interface LitemallTestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     */
    long countByExample(LitemallTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     */
    int insert(LitemallTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     */
    int insertSelective(LitemallTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallTest selectOneByExample(LitemallTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallTest selectOneByExampleSelective(@Param("example") LitemallTestExample example, @Param("selective") LitemallTest.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallTest> selectByExampleSelective(@Param("example") LitemallTestExample example, @Param("selective") LitemallTest.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     */
    List<LitemallTest> selectByExample(LitemallTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallTest selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallTest.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     */
    LitemallTest selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallTest record, @Param("example") LitemallTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallTest record, @Param("example") LitemallTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_test
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallTest record);
}