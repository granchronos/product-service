package pe.edu.idat.productservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pe.edu.idat.productservice.model.Product;
import pe.edu.idat.productservice.repository.ProductRepository;
import pe.edu.idat.productservice.service.ProductService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product addOrUpdate(Product Product) {
        return productRepository.save(Product);
    }

    @Override
    public Page<Product> all(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Optional<Product> get(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> obtains() {
        return productRepository.findAll();
    }
}
