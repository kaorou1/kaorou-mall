package com.kaorou.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kaorou.mall.product.entity.BrandEntity;
import com.kaorou.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BrandTest {

    @Autowired
    BrandService brandService;

    @Test
    public void test1(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("hongmi");
        brandService.save(brandEntity);
        System.out.println("结束");
    }

    @Test
    public void test2(){

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 9L));
        list.stream().forEach(System.out::println);
        System.out.println("结束");
    }

}
