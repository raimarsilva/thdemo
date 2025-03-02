package rai.practices.thdemo.domain.models;

import java.util.List;

//import org.springframework.data.annotation.Id;

public record Product(
                // @Id
                Long id,
                String name,
                double price,
                boolean inStock,
                List<Comment> comments) {
}
