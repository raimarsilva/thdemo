package rai.practices.thdemo.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rai.practices.thdemo.domain.models.Product;
import rai.practices.thdemo.domain.repositories.ProductRepository;

@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public void addProduct(Product product) {
    // Add product to the database
  }

  public void updateProduct(Product product) {
    // Update product in the database
  }

  public void deleteProduct(Product product) {
    // Delete product from the database
  }

  public Product getProductById(Long id) {
    // Get product from the database
    return null;
  }

  public Product getProduct() {
    // Get all products from the database
    return productRepository.getProduct();
  }
}
