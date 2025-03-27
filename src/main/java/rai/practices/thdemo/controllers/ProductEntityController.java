package rai.practices.thdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rai.practices.thdemo.domain.dtos.ProductEntityDTO;
import rai.practices.thdemo.domain.entities.ProductEntity;
import rai.practices.thdemo.domain.services.ProductEntityService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/products")
public class ProductEntityController {
  private final ProductEntityService productEntityService;

  public ProductEntityController(ProductEntityService productEntityService) {
    this.productEntityService = productEntityService;
  }

  @GetMapping
  public String testGet() {
    return "resposta OK";
  }

  @PostMapping("/save")
  public ResponseEntity<ProductEntity> saveProduct(@RequestBody(required = true) ProductEntityDTO productEntityDTO) {

    return ResponseEntity.status(HttpStatus.CREATED).body(productEntityService.saveProduct(productEntityDTO));
  }

}
