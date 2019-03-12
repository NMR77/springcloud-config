package com.myapp.food.delivery.orderservice.api.web;

public class CreateOrderResponse {
  private long orderId;

  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }

  private CreateOrderResponse() {
  }

  public CreateOrderResponse(long orderId) {
    this.orderId = orderId;
  }
}
