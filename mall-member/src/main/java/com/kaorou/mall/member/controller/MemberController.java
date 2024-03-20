package com.kaorou.mall.member.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.kaorou.mall.member.feign.CouponClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kaorou.mall.member.entity.MemberEntity;
import com.kaorou.mall.member.service.MemberService;
import com.kaorou.common.utils.PageUtils;
import com.kaorou.common.utils.R;



/**
 * 会员
 *
 * @author kaorou
 * @email whyxx4583@gmail.com
 * @date 2024-03-20 13:52:02
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private CouponClient couponClient;

    @RequestMapping("/getKaorouInfo")
    public R getKaorouInfo(){
        MemberEntity member = new MemberEntity();
        member.setNickname("烤肉6");

        //远程调用coupon查询优惠券
        R r = couponClient.getKaorou();
        return R.ok().put("member", member).put("远程结果", r);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
