package com.sheng.hrt.dao;

import com.sheng.hrt.po.ThirdChannel;
@org.apache.ibatis.annotations.Mapper
public interface ThirdChannelMapper extends Mapper<ThirdChannel,Long>{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table third_channel
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long channelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table third_channel
     *
     * @mbggenerated
     */
    int insert(ThirdChannel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table third_channel
     *
     * @mbggenerated
     */
    int insertSelective(ThirdChannel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table third_channel
     *
     * @mbggenerated
     */
    ThirdChannel selectByPrimaryKey(Long channelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table third_channel
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ThirdChannel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table third_channel
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ThirdChannel record);
}