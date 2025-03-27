package rai.practices.thdemo.domain.services;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rai.practices.thdemo.domain.dtos.ProductEntityDTO;
import rai.practices.thdemo.domain.entities.ProductEntity;
import rai.practices.thdemo.domain.repositories.ProductEntityRepository;

@Service
public class ProductEntityService {
  private final ProductEntityRepository productEntityRepository;

  public ProductEntityService(ProductEntityRepository productEntityRepository) {
    this.productEntityRepository = productEntityRepository;
  }

  @Transactional
  public ProductEntity saveProduct(ProductEntityDTO productEntityDTO) {
    ProductEntity productEntity = new ProductEntity(productEntityDTO.getName());
    productEntityRepository.save(productEntity);
    return productEntity;
  }

}
