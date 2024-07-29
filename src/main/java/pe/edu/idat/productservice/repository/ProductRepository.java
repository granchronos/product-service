package pe.edu.idat.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
