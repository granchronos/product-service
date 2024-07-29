package pe.edu.idat.productservice.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pe.edu.idat.productservice.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product addOrUpdate(Product product);

    Page<Product> all(Pageable pageable);

    Optional<Product> get(Long id);

    void delete(Long id);

    List<Product> obtains();

}
