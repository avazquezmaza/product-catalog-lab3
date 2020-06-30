package com.redhat.coolstore.productcatalog;

import java.net.InetAddress;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCatalogService {

    @Autowired
    private ProductRepository productRepository;
    
    @Value("${coolstore.message:Hello World!}")
    private String message;

    @GetMapping("/products")
    public List<Product> list() {
    	System.out.println("Pista singh is working...."+System.currentTimeMillis());
    	try {
    	InetAddress myIP=InetAddress.getLocalHost();
    	System.out.println("Hostname : "+myIP.getHostAddress());
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
    	
        return productRepository.findAll();
    }
    
}
