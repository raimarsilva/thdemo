package rai.practices.thdemo.domain.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public record ProductEntity(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(nullable = false) UUID id,
        @Column(nullable = false) String name) {

    public ProductEntity(String name) {
        this(UUID.randomUUID(), name);
    }
}
