package edu.poly.hello.responsitories;

import edu.poly.hello.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductResponsitory extends JpaRepository<Product, Long> {
}
