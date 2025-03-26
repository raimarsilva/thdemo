package rai.practices.thdemo.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import rai.practices.thdemo.domain.entities.ProductEntity;

public interface ProductEntityRepository extends JpaRepository<ProductEntity, UUID> {

}
