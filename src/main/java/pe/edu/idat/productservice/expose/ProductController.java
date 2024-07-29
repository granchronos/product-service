package pe.edu.idat.productservice.expose;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.productservice.model.Product;
import pe.edu.idat.productservice.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<List<Product>> all() {
        return ResponseEntity.ok(productService.obtains());
    }

    @PostMapping("/add")
    public ResponseEntity<Product> add(Product product) {
        if (product == null || product.getId() != null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(productService.addOrUpdate(product));
    }

}
