package cn.peach.service.impl;

import cn.peach.client.ProductClientFeign;
import cn.peach.pojo.Product;
import cn.peach.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductClientFeign productClientFeign;

    @Override
    public List<Product> listProducts() {
        return productClientFeign.listProdcuts();
    }
}
