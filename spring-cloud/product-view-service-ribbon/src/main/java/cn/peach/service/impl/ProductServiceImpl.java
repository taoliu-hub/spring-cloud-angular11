package cn.peach.service.impl;

import cn.peach.client.ProductClientRibbon;
import cn.peach.pojo.Product;
import cn.peach.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductClientRibbon productClientRibbon;

    @Override
    public List<Product> listProducts() {
        return productClientRibbon.listProdcuts();
    }
}
