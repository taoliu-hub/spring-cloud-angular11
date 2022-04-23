package cn.peach.controller;

import cn.peach.pojo.Product;
import cn.peach.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value="/products", method= RequestMethod.GET)
    public Object products() {
        List<Product> ps = productService.listProducts();
        return ps;
    }

}
