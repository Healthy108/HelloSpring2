package edu.poly.hello.controller;

import edu.poly.hello.models.Product;
import edu.poly.hello.responsitories.ProductResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
    //DI = Dependence Injection
    @Autowired
    private ProductResponsitory responsitory;

    @GetMapping("")
    // this request is: http://localhost:8080/api/v1/Products
    List<Product> getAllProducts() {
        return responsitory.findAll();

        //Save to database, We have H2 DB = In-memory Database
        //Can use request use Postman
    }
}
