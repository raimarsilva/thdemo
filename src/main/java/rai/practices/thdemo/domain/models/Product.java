package rai.practices.thdemo.domain.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public record Product(
                @Id Long id,
                String name,
                double price,
                boolean inStock,
                List<Comment> comments) {
}
