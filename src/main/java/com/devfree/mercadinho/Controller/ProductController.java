package com.devfree.mercadinho.Controller;

import com.devfree.mercadinho.entities.Product;
import com.devfree.mercadinho.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/produto")
public class ProductController {

        @Autowired
        private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // @GetMapping(value = "/{id}")
        // public ResponseEntity<?> find(@PathVariable Integer id) {
        //     Produto obj = null;
        //     try {
        //         obj = ProductService.buscar(id) == null ? null : produtoService.buscar(id);
        //     } catch (Exception e) {
        //         System.out.println(e);
        //     }
        //     return ResponseEntity.ok().body(obj);
        // }


        @GetMapping(value = "/")
        public List<Product> findSales() {
            List<Product> produtos = (List<Product>) productService.buscarTodos();
            return produtos;
    }
}
