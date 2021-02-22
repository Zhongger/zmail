package com.zhongger.zmail.coupon.dao;

import com.zhongger.zmail.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author zhongmingyi
 * @email zhongmingyi@bytedance.com
 * @date 2019-10-08 09:36:40
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}
