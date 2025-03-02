package rai.practices.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import rai.practices.demo.domain.services.ProductService;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

  @Autowired
  private ProductService productService;

  @GetMapping("/product")
  public String viewRootPage(Model model) {
    model.addAttribute("product", productService.getProduct());
    model.addAttribute("comments", productService.getProduct().comments());
    return "product";
  }

}
