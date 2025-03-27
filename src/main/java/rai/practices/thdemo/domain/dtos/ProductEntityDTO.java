package rai.practices.thdemo.domain.dtos;

public class ProductEntityDTO {
  private String name;

  public ProductEntityDTO(String name) {
    this.name = name;
  }

  public ProductEntityDTO() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
