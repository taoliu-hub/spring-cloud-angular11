package cn.peach.client;/*
 * Create By Tao on 2022/4/24.
 *
 * */

import cn.peach.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductClientFeignHystrix implements ProductClientFeign{

    public List<Product> listProdcuts(){
        List<Product> result = new ArrayList<>();
        result.add(new Product(0,"产品数据微服务现在不可用",0));
        return result;
    }
}
