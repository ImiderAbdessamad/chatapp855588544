package com.example.test.ws;

import com.example.test.bean.Product;
import com.example.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/admin/product/")
public class ProductWs {
    @Autowired
    private ProductService service;

    @GetMapping("label/{label}")
    public Product findByLabel(@PathVariable String label) {
        return service.findByLabel(label);
    }

    @GetMapping
    public List<Product> findAll() {
        return service.findAll();
    }
}
