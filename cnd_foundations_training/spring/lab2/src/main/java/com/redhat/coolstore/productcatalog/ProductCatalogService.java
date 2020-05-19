package com.redhat.coolstore.productcatalog;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class ProductCatalogService {

    @Value("${coolstore.message:Hello World!}")
    private String message;
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/products")
    //public String sayHello() {
    //   return message;
    //}	
    public List<Product> list() {
        return productRepository.findAll();
    }

}
