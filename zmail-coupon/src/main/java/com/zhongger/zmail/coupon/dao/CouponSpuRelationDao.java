package com.zhongger.zmail.coupon.dao;

import com.zhongger.zmail.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 *
 * @author zhongmingyi
 * @email zhongmingyi@bytedance.com
 * @date 2019-10-08 09:36:40
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {

}
