package com.myapp.food.delivery.orderservice.domain;

public class InvalidMenuItemIdException extends RuntimeException {
  public InvalidMenuItemIdException(String menuItemId) {
    super("Invalid menu item id " + menuItemId);
  }
}
