package rai.practices.demo.domain.models;

import java.util.Date;
import java.util.List;

public class Order {
  private Long id;
  private Date orderDate;
  private Customer customer;
  private List<OrderLine> orderLines;
}
