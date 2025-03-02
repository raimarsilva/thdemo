package rai.practices.thdemo.domain.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import rai.practices.thdemo.domain.models.Product;
import rai.practices.thdemo.domain.models.Comment;

@Repository
public class ProductRepository {
  List<Comment> comments;
  Product p1;

  ProductRepository() {
    super();
  }

  public Product getProduct() {
    comments = new ArrayList<>();
    Comment comment = new Comment(1L, "Great product!");
    comments.add(comment);
    for (var c : comments) {
      System.out.println("id: " + c.id());
      System.out.println("text: " + c.text());
    }
    p1 = new Product(1L, "Product 1", 100.0, true, comments);
    return p1;
  }
}
