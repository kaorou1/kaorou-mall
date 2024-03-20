package com.kaorou.mall.member.dao;

import com.kaorou.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author kaorou
 * @email whyxx4583@gmail.com
 * @date 2024-03-20 13:52:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
