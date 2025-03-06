package rai.practices.thdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import rai.practices.thdemo.domain.services.ProductService;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

  @Autowired
  private ProductService productService;

  @GetMapping("/products")
  public String viewRootPage(Model model) {
    model.addAttribute("product", productService.getProduct());
    // model.addAttribute("comments", productService.getProduct().comments());
    model.addAttribute("thVersion", org.thymeleaf.Thymeleaf.getVersion());
    System.out.println(model.toString());
    return "product";
  }

}
