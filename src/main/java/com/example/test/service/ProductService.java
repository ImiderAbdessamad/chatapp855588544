package com.example.test.service;

import com.example.test.bean.Product;
import com.example.test.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDao dao;

    @Value("${cloud-upload.secretKey}")
    private String accessKey;

    @Value("${remoteRepo.accessToken}")
    private String personalAccessToken;

    public Product findByLabel(String label) {

        System.out.println(accessKey);
        return dao.findByLabel(label);
    }

    public List<Product> findAll() {
        return dao.findAll();
    }
}
